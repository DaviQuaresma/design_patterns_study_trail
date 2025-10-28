package org.example.structural.pratice.adapter.exercise1;

import java.util.Date;

public class PaymentAdapter implements PaymentProcessor {
    private final LegacyPaymentAPI legacyApi;

    public PaymentAdapter(String name, String email, double money){
        this.legacyApi = new LegacyPaymentAPI(name, email, money, new Date());
    }

    @Override
    public void processPayment(double amount) {
        legacyApi.payBill(amount);
    }

    @Override
    public void addFunds(double amount) {
        legacyApi.receiveMoney(amount);
    }

    @Override
    public void showAccount() {
        legacyApi.checkAccount();
    }
}
