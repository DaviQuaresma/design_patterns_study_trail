package org.example.creation.pratice.builder.exe1;

import org.example.creation.pratice.builder.exe1.pizza.Pizza;
import org.example.creation.pratice.builder.exe1.pizza.PizzaBuilder;

// O PizzaDirector define a ordem da montagem (sequência dos passos).

public class PizzaDirector {
    private final PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void montarPizza(){
        builder.addMassa();
        builder.addClient();
        builder.addMolho();
        builder.addBorda();
        builder.addRecheio();
    }

    public Pizza getPizza(){
        return builder.getPizza();
    }
}
