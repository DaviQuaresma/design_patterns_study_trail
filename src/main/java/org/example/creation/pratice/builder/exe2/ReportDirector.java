package org.example.creation.pratice.builder.exe2;

import org.example.creation.pratice.builder.exe2.reports.Report;
import org.example.creation.pratice.builder.exe2.reports.ReportBuilder;

public class ReportDirector {
    private final ReportBuilder builder;

    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }

    public void GerarReport() {
        builder.addHeader();
        builder.addBody();
        builder.addFooter();
    }

    public Report getReport() {
        return builder.getReport();
    }
}
