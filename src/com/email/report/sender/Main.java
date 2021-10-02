package com.email.report.sender;

import com.email.report.sender.email.Attachment;
import com.email.report.sender.email.Email;
import com.email.report.sender.email.EmailSender;
import com.email.report.sender.email.ServerProperties;
import com.email.report.sender.report.Report;
import com.email.report.sender.report.ReportGenerator;

import javax.mail.MessagingException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws MessagingException, IOException {

        String startingMonth = "";
        String endingMonth = "";
        String fileName = "report/Assignment-2 2021 (2) (1).pdf";

        ReportGenerator reportGenerator = new ReportGenerator();
        Report report = reportGenerator.generateReport(startingMonth, endingMonth, fileName);

        EmailSender emailSender = new EmailSender(getServerProperties());
        Email email = new Email();
        email.setSubject(report.getSubject());

        Attachment attachment = new Attachment();
        attachment.setAttachment(report.getData());

        emailSender.send(email);
    }

    private static ServerProperties getServerProperties() {

        return new ServerProperties("smtp.gmail.com", "587","lbookbae@gmail.com","bookbae1234");
    }
}
