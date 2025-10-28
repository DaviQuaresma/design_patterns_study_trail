package org.example.structural.pratice.facade.exercise1;

import org.example.structural.pratice.facade.exercise1.classes.*;

public class BankFacade {
    private final Conta conta;
    private final Extrato extrato;
    private final Saldo saldo;
    private final Seguranca seguranca;

    public BankFacade() {
        conta = new Conta();
        extrato = new Extrato();
        saldo = new Saldo();
        seguranca = new Seguranca();
    }

    public void transferir(double valor, String contaOrigem, String contaDestino) {
        System.out.println("=== Iniciando transferência ===");
        seguranca.verificarPermissao(contaOrigem);
        saldo.verificarSaldo(contaOrigem, valor);
        conta.transferir(contaOrigem, contaDestino, valor);
        extrato.registrarTransferencia(contaOrigem, contaDestino, valor);
        System.out.println("=== Transferência concluída ===");
    }
}
