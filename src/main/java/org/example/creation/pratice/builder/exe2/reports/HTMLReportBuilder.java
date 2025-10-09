package org.example.creation.pratice.builder.exe2.reports;

import org.example.creation.pratice.builder.exe2.components.Body;
import org.example.creation.pratice.builder.exe2.components.Footer;
import org.example.creation.pratice.builder.exe2.components.Header;

public class HTMLReportBuilder implements ReportBuilder {
    private final Report report = new Report();

    @Override
    public void addBody() {
        report.setBody(new Body("Body - Html"));
    }

    @Override
    public void addFooter() {
        report.setFooter(new Footer("Footer - Html"));
    }

    @Override
    public void addHeader() {
        report.setHeader(new Header("Header - Html"));
    }

    @Override
    public Report getReport() {
        return report;
    }
}
