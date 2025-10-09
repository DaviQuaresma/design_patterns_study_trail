package org.example.creation.pratice.builder.exe1.pizza;

import org.example.creation.pratice.builder.exe1.borda.Borda;
import org.example.creation.pratice.builder.exe1.massa.Massa;
import org.example.creation.pratice.builder.exe1.molho.Molho;
import org.example.creation.pratice.builder.exe1.recheio.Recheio;

public class PizzaCalabresaBuilder implements PizzaBuilder{
    private final Pizza pizza = new Pizza();

    @Override
    public void addMassa() {
        pizza.setMassa(new Massa("Tradicional"));
    }

    @Override
    public void addMolho() {
        pizza.setMolho(new Molho("Tomate"));
    }

    @Override
    public void addRecheio() {
        pizza.setRecheio(new Recheio("Calabresa com cebola"));
    }

    @Override
    public void addBorda() {
        pizza.setBorda(new Borda("Catupiry"));
    }

    @Override
    public void addClient() {
        pizza.setClient("Davi Quaresma");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
