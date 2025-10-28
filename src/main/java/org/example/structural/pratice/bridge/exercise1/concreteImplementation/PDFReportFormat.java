package org.example.structural.pratice.bridge.exercise1.concreteImplementation;

import org.example.structural.pratice.bridge.exercise1.ReportFormat;

public class PDFReportFormat implements ReportFormat {

    @Override
    public void generate(String title, String content) {
        System.out.println("📄 [PDF]");
        System.out.println("Título: " + title);
        System.out.println("Conteúdo:\n" + content);
        System.out.println("============================\n");
    }
}
