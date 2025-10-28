package org.example.structural.pratice.bridge.exercise1.concreteSubClasses;

import org.example.structural.pratice.bridge.exercise1.Report;
import org.example.structural.pratice.bridge.exercise1.ReportFormat;

public class InventoryReport extends Report {

    public InventoryReport(ReportFormat format) {
        super(format);
    }

    @Override
    public void generateReport() {
        String title = "Relatório de Estoque";
        String content = "Produtos em estoque: 120\nItens em falta: 5";
        format.generate(title, content);
    }
}
