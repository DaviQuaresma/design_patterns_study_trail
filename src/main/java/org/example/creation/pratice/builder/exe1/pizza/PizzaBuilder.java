package org.example.creation.pratice.builder.exe1.pizza;

public interface PizzaBuilder {
    void addMassa();
    void addMolho();
    void addRecheio();
    void addBorda();
    void addClient();
    Pizza getPizza();
}
