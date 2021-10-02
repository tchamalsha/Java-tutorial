package com.email.report.sender.email;

import java.io.File;

public class Attachment {

    private String name;
    private File attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getAttachment() {
        return attachment;
    }

    public void setAttachment(File attachment) {
        this.attachment = attachment;
    }
}
