package com.email.report.sender.email;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;

public class EmailSender {

    private final ServerProperties serverProperties;

    public EmailSender(ServerProperties serverProperties) {
        this.serverProperties = serverProperties;
    }

    public void send(Email email) throws MessagingException, IOException {

        Message message = new MimeMessage(initializeSession());
        Address addressTo = new InternetAddress(email.getToAddress());

        message.setSubject(email.getSubject());
        message.setRecipient(Message.RecipientType.TO, addressTo);

        MimeBodyPart attachment = new MimeBodyPart();
        attachment.attachFile(email.getAttachment().getAttachment());
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(attachment);

        message.setContent(multipart);

        Transport.send(message);
    }

    private Session initializeSession() {

        Properties properties = serverProperties.getServerProperties();

        // Creates a new session with an authenticator.
        return Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(serverProperties.getUserName(), serverProperties.getPassword());
            }
        });
    }
}
