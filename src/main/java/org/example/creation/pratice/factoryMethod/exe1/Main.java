package org.example.creation.pratice.factoryMethod.exe1;

/*
🏦 Ex 1 — Criação de contas bancárias

Contexto:
Seu ERP precisa criar contas: ContaCorrente, ContaPoupanca, ContaInvestimento.

Desafio:
Crie uma classe Banco com método fábrica criarConta(tipo).
Subclasses (BancoDigital, BancoFisico) redefinem esse método pra retornos diferentes.

Objetivo:
Permitir extensões sem tocar na lógica principal.

Vantagem:
Inversão de controle — quem define o tipo exato é a subclasse.
 */

import org.example.creation.pratice.factoryMethod.exe1.classes.Banco;
import org.example.creation.pratice.factoryMethod.exe1.classes.BancoDigital;
import org.example.creation.pratice.factoryMethod.exe1.classes.BancoFisico;

public class Main {
    public static void main(String[] args) {
        Banco banco1 = new BancoFisico();
        Banco banco2 = new BancoDigital();

        System.out.println("=== Banco fisico ===");
        banco1.abrirNovaConta("corrente");
        banco1.abrirNovaConta("poupanca");

        System.out.println("=== Banco digital ===");
        banco2.abrirNovaConta("corrente");
        banco2.abrirNovaConta("investimento");
    }
}
