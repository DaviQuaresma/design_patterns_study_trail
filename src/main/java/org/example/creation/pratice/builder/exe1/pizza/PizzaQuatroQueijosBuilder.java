package org.example.creation.pratice.builder.exe1.pizza;

import org.example.creation.pratice.builder.exe1.borda.Borda;
import org.example.creation.pratice.builder.exe1.massa.Massa;
import org.example.creation.pratice.builder.exe1.molho.Molho;
import org.example.creation.pratice.builder.exe1.recheio.Recheio;

public class PizzaQuatroQueijosBuilder implements PizzaBuilder{
    private final Pizza pizza = new Pizza();

    @Override
    public void addMassa() {
        pizza.setMassa(new Massa("Fina"));
    }

    @Override
    public void addMolho() {
        pizza.setMolho(new Molho("Molho branco"));
    }

    @Override
    public void addRecheio() {
        pizza.setRecheio(new Recheio("Queijo prato, mussarela, parmesão, gorgonzola"));
    }

    @Override
    public void addBorda() {
        pizza.setBorda(new Borda("Recheada com queijo"));
    }

    @Override
    public void addClient() {
        pizza.setClient("Christiane Quaresma");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
