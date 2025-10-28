package org.example.structural.pratice.bridge.exercise1;

//Aqui está o “lado abstrato” da ponte — define o que é um relatório, mas delega como ele é gerado à implementação (ReportFormat).

public abstract class Report {
    protected ReportFormat format;

    public Report(ReportFormat format) {
        this.format = format;
    }

    public abstract void generateReport();
}
