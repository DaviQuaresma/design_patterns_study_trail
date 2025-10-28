package org.example.structural.pratice.bridge.exercise1;

/*
🏗️ Ex 1 — Relatórios em múltiplos formatos

Contexto:
Um sistema precisa gerar relatórios em PDF, HTML e CSV.

Desafio:
Crie a abstração Report (classe abstrata) e a implementação ReportFormat (interface).
Subclasses: SalesReport, InventoryReport usam diferentes implementações (PDFReportFormat, HTMLReportFormat).

Vantagem:
Separação entre “o que é o relatório” e “como ele é gerado”.
 */

import org.example.structural.pratice.bridge.exercise1.concreteImplementation.CSVReportFormat;
import org.example.structural.pratice.bridge.exercise1.concreteImplementation.HTMLReportFormat;
import org.example.structural.pratice.bridge.exercise1.concreteImplementation.PDFReportFormat;
import org.example.structural.pratice.bridge.exercise1.concreteSubClasses.InventoryReport;
import org.example.structural.pratice.bridge.exercise1.concreteSubClasses.SalesReport;

public class Main {
    public static void main(String[] args) {
        Report salesPDF = new SalesReport(new PDFReportFormat());
        salesPDF.generateReport();

        Report salesHTML = new SalesReport(new HTMLReportFormat());
        salesHTML.generateReport();

        Report inventoryCSV = new InventoryReport(new CSVReportFormat());
        inventoryCSV.generateReport();
    }
}

/*
Explicação

Report → abstração genérica (define o tipo do relatório).
ReportFormat → interface de implementação (define o formato de saída).
SalesReport, InventoryReport → concretizam a abstração.
PDFReportFormat, HTMLReportFormat, CSVReportFormat → concretizam a implementação.

O Bridge permite combinar qualquer Report com qualquer ReportFormat sem alterar código existente.

 */