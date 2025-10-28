package org.example.structural.pratice.facade.exercise1.classes;

public class Conta {
    public void transferir(String origem, String destino, double valor) {
        System.out.println("Transferindo R$" + valor + " da conta " + origem + " para " + destino);
    }

    public String ShowConta() {
        return "Conta ativa";
    }
}