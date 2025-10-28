package org.example.structural.pratice.bridge.exercise1.concreteImplementation;

import org.example.structural.pratice.bridge.exercise1.ReportFormat;

public class CSVReportFormat implements ReportFormat {

    @Override
    public void generate(String title, String content) {
        System.out.println("📈 [CSV]");
        System.out.println("Title,Content");
        System.out.println("\"" + title + "\",\"" + content.replace("\n", " | ") + "\"");
        System.out.println("============================\n");
    }
}
