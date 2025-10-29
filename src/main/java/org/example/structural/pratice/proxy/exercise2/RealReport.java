package org.example.structural.pratice.proxy.exercise2;

public class RealReport implements Report {
    private final String reportName;

    public RealReport(String reportName) {
        this.reportName = reportName;
        loadReport();
    }

    private void loadReport() {
        System.out.println("🔍 Carregando relatório: " + reportName);
        try {
            Thread.sleep(800); // simula leitura do banco ou arquivo
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("📄 Exibindo conteúdo do relatório: " + reportName);
    }
}