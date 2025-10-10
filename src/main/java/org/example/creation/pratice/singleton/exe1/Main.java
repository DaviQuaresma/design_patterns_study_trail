package org.example.creation.pratice.singleton.exe1;

/*
🧾 Ex 1 — Logger central do sistema

Contexto:
Você quer um único ponto de log no ERP (gravar logs em arquivo).

Desafio:
Implemente Logger como Singleton com método getInstance().
Cada parte do sistema deve usar Logger.getInstance().log("msg").

Vantagem:
Centralização — uma única instância gerencia logs.
 */

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Sistema iniciado com sucesso");
        logger2.log("Conexão com banco de dados estabelecida");

        System.out.println("\nlogger1 == logger2 ? " + (logger1 == logger2));
    }

}
