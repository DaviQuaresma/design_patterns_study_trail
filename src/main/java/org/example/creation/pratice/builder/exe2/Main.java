package org.example.creation.pratice.builder.exe2;

/*

🏗️ Ex 2 — Gerador de relatórios no ERP

Contexto:
Seu ERP precisa gerar relatórios em PDF, HTML e JSON.

Desafio:
Crie um ReportBuilder com passos (addHeader, addBody, addFooter).
Crie builders concretos: PDFReportBuilder, HTMLReportBuilder, JSONReportBuilder.

Objetivo:
Gerar diferentes formatos de saída com o mesmo código diretor (ReportDirector).

Vantagem:
Flexibilidade total na forma de montar estruturas complexas (sem repetir lógica).

 */


import org.example.creation.pratice.builder.exe2.reports.HTMLReportBuilder;
import org.example.creation.pratice.builder.exe2.reports.Report;
import org.example.creation.pratice.builder.exe2.reports.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        ReportBuilder htmlBuilder = new HTMLReportBuilder();
        ReportDirector htmlDirector = new ReportDirector(htmlBuilder);

        htmlDirector.GerarReport();
        Report report1 = htmlDirector.getReport();
        report1.showReport();

    }
}
