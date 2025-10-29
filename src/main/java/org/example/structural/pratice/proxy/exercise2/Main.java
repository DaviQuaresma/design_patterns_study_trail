package org.example.structural.pratice.proxy.exercise2;

/*
🔒 Ex 2 — Controle de acesso a relatórios

Contexto:
Relatórios sensíveis só podem ser acessados por administradores.

Desafio:
Crie Report (interface), RealReport (acesso real) e ReportProxy (verifica permissões).

Vantagem:
Segurança e controle sem alterar o objeto real.
 */

public class Main {
    public static void main(String[] args) {
        Report reportAdmin = new ReportProxy("Relatório Financeiro", "ADMIN");
        Report reportUser = new ReportProxy("Relatório Financeiro", "USER");

        System.out.println("\n👨‍💼 Tentando acesso com usuário comum:");
        reportUser.display();

        System.out.println("\n🧑‍💻 Tentando acesso com administrador:");
        reportAdmin.display();

        System.out.println("\n🧑‍💻 Reabrindo relatório (já carregado):");
        reportAdmin.display();
    }
}