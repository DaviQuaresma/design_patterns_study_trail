package org.example.creation.pratice.builder.exe2.reports;

public interface ReportBuilder {
    void addBody();
    void addFooter();
    void addHeader();
    Report getReport();
}
