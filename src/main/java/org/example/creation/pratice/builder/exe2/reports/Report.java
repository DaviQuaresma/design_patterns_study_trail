package org.example.creation.pratice.builder.exe2.reports;

import org.example.creation.pratice.builder.exe2.components.Body;
import org.example.creation.pratice.builder.exe2.components.Footer;
import org.example.creation.pratice.builder.exe2.components.Header;

public class Report {
    private Body body;
    private Footer footer;
    private Header header;

    public void setBody(Body body) {
        this.body = body;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void showReport() {
        System.out.println("Report - Header: " + header);
        System.out.println("Report - Body: " + body);
        System.out.println("Report - Footer: " + footer);
    }
}
