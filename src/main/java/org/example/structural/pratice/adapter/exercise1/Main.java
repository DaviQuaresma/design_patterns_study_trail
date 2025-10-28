package org.example.structural.pratice.adapter.exercise1;

/*
⚙️ 1. Adapter
🧾 Ex 1 — Integração de pagamento legado

Contexto:
Seu ERP precisa integrar um módulo novo com um sistema legado de pagamento (LegacyPaymentAPI) que usa métodos e tipos diferentes.

Desafio:
Crie um adaptador (PaymentAdapter) que converta as chamadas da nova interface PaymentProcessor para o legado.

Vantagem:
Permite evoluir sistemas sem reescrever módulos antigos.
 */

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter("Davi", "davi@example.com", 200.0);

        processor.showAccount();
        processor.addFunds(100.0);
        processor.processPayment(250.0);
        processor.showAccount();
    }
}
