package org.example.structural.pratice.facade.exercise1.classes;

public class Saldo {
    public void verificarSaldo(String conta, double valor) {
        System.out.println("Verificando saldo da conta " + conta + " para transferência de R$" + valor);
    }

    public void ShowSaldo() {
        System.out.println("Saldo: R$ 1500.00");
    }
}
