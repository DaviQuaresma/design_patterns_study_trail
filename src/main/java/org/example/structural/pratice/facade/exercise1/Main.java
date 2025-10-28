package org.example.structural.pratice.facade.exercise1;

/*
🏦 Ex 1 — Sistema bancário simplificado

Contexto:
Várias classes controlam conta, saldo, extrato e segurança.

Desafio:
Crie BankFacade com método transferir(valor, contaOrigem, contaDestino) que chama todas as classes internas.

Vantagem:
Simplifica o uso de subsistemas complexos.
 */

public class Main {
    public static void main(String[] args) {
        BankFacade banco = new BankFacade();
        banco.transferir(500, "1234", "9876");
    }
}