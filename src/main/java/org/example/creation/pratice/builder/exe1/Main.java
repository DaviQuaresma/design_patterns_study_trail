package org.example.creation.pratice.builder.exe1;

/*
🍕 Ex 1 — Montador de pizza

Contexto:
Você precisa montar pedidos de pizza (massa, molho, recheio, borda).

Desafio:
Crie um PizzaBuilder com métodos addMassa(), addMolho(), etc.
Depois implemente dois builders concretos: PizzaCalabresaBuilder, PizzaQuatroQueijosBuilder.
Use um PizzaDirector pra orquestrar o processo.

Objetivo:
Gerar diferentes combinações passo a passo com um mesmo fluxo de construção.

Vantagem:
Controle de construção sem precisar de construtores gigantes.
 */

import org.example.creation.pratice.builder.exe1.pizza.Pizza;
import org.example.creation.pratice.builder.exe1.pizza.PizzaBuilder;
import org.example.creation.pratice.builder.exe1.pizza.PizzaCalabresaBuilder;
import org.example.creation.pratice.builder.exe1.pizza.PizzaQuatroQueijosBuilder;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder calabresaBuilder = new PizzaCalabresaBuilder();
        PizzaDirector diretorCalabresa = new PizzaDirector(calabresaBuilder);
        diretorCalabresa.montarPizza();
        Pizza pizza1 = diretorCalabresa.getPizza();
        pizza1.showPizza();

        System.out.println("\n=============================\n");

        PizzaBuilder quatroQueijosBuilder = new PizzaQuatroQueijosBuilder();
        PizzaDirector diretorQuejos = new PizzaDirector(quatroQueijosBuilder);
        diretorQuejos.montarPizza();
        Pizza pizza2 = diretorQuejos.getPizza();
        pizza2.showPizza();

        System.out.println("\n=============================\n");

    }
}
