package org.example.structural.pratice.bridge.exercise1;

//Essa interface define como o relatório será gerado (PDF, HTML, CSV...).

public interface ReportFormat {
    void generate(String title, String content);
}
