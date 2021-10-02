package com.email.report.sender.report;

import java.io.File;

public class ReportGenerator {

    public Report generateReport(String startingMonth, String endingMonth, String fileName) {

        String subject = "Daily Sales Report from " + startingMonth + " to " + endingMonth;
        File dataFile = new File(fileName);

        Report report = new Report();
        report.setSubject(subject);
        report.setData(dataFile);

        return report;
    }
}
