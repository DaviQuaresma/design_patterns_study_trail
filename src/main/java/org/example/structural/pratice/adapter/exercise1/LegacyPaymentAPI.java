package org.example.structural.pratice.adapter.exercise1;

import java.util.Date;

public class LegacyPaymentAPI {

    String name;
    String email;
    double money;
    Date date;

    public LegacyPaymentAPI(String name, String email, double money, Date date) {
        this.name = name;
        this.email = email;
        this.money = money;
        this.date = date;
    }

    public void receiveMoney(double amout){
        this.money += amout;
    }

    public void payBill(double billValue){

        if(this.money < billValue){
            System.out.println("Você não tem saldo para pagar essa conta!");
        }

        this.money -= billValue;
    }

    public void newMail(String email){
        this.email = email;
    }

    public void newName(String name){
        this.name = name;
    }

    public void checkAccount(){
        System.out.println("=================");
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Dinheiro na conta: " + this.money);
        System.out.println("Data do Log: " + this.date);
        System.out.println("=================");
    }


}
