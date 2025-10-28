package org.example.structural.pratice.bridge.exercise1.concreteSubClasses;

import org.example.structural.pratice.bridge.exercise1.Report;
import org.example.structural.pratice.bridge.exercise1.ReportFormat;

public class SalesReport extends Report {

    public SalesReport(ReportFormat format) {
        super(format);
    }

    @Override
    public void generateReport() {
        String title = "Relatório de Vendas";
        String content = "Vendas do mês: R$ 50.000,00\nProdutos vendidos: 230 unidades";
        format.generate(title, content);
    }
}
