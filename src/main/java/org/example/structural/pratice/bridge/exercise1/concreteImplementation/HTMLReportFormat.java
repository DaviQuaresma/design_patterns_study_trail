package org.example.structural.pratice.bridge.exercise1.concreteImplementation;

import org.example.structural.pratice.bridge.exercise1.ReportFormat;

public class HTMLReportFormat implements ReportFormat {

    @Override
    public void generate(String title, String content) {
        System.out.println("🌍 [HTML]");
        System.out.println("<html><head><title>" + title + "</title></head>");
        System.out.println("<body><h1>" + title + "</h1><p>" + content + "</p></body></html>");
        System.out.println("============================\n");
    }
}
