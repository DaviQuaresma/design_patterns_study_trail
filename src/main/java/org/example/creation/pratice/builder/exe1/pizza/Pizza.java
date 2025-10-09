package org.example.creation.pratice.builder.exe1.pizza;

import org.example.creation.pratice.builder.exe1.borda.Borda;
import org.example.creation.pratice.builder.exe1.massa.Massa;
import org.example.creation.pratice.builder.exe1.molho.Molho;
import org.example.creation.pratice.builder.exe1.recheio.Recheio;

public class Pizza {
    private Molho molho;
    private Massa massa;
    private Recheio recheio;
    private Borda borda;
    private String client;

    public void setMassa(Massa massa){
        this.massa = massa;
    }

    public void setMolho(Molho molho){
        this.molho = molho;
    }

    public void setBorda(Borda borda){
        this.borda = borda;
    }

    public void setRecheio(Recheio recheio){
        this.recheio = recheio;
    }

    public void setClient(String client){
        this.client = client;
    }

    public void showPizza(){
        System.out.println("Pizza pronta!");
        System.out.println("- Massa: " + massa);
        System.out.println("- Molho: " + molho);
        System.out.println("- Recheio: " + recheio);
        System.out.println("- Borda: " + borda);
        System.out.println("- Cliente: " + client);
    }

}
