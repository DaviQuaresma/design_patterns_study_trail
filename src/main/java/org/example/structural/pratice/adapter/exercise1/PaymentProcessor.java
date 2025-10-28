package org.example.structural.pratice.adapter.exercise1;

public interface PaymentProcessor {
    void processPayment(double amount);
    void addFunds(double amount);
    void showAccount();
}
