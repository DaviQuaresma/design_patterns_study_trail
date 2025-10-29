package org.example.structural.pratice.proxy.exercise2;

public class ReportProxy implements Report {
    private RealReport realReport;
    private final String reportName;
    private final String userRole;

    public ReportProxy(String reportName, String userRole) {
        this.reportName = reportName;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if (!hasPermission()) {
            System.out.println("❌ Acesso negado! Usuário sem permissão para visualizar o relatório: " + reportName);
            return;
        }

        if (realReport == null) {
            realReport = new RealReport(reportName);
        }

        realReport.display();
    }

    private boolean hasPermission() {
        return "ADMIN".equalsIgnoreCase(userRole);
    }
}