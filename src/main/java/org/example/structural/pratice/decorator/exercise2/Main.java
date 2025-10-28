package org.example.structural.pratice.decorator.exercise2;

/*
☕ Ex 2 — Sistema de café

Contexto:
Monte bebidas personalizadas: Espresso, Latte, Mocha.

Desafio:
Implemente Beverage e decoradores Milk, Sugar, Chocolate.

Vantagem:
Permite montar combinações em tempo de execução.
 */

import org.example.structural.pratice.decorator.exercise2.components.Beverage;
import org.example.structural.pratice.decorator.exercise2.concrete.Espresso;
import org.example.structural.pratice.decorator.exercise2.concrete.Latte;
import org.example.structural.pratice.decorator.exercise2.concrete.Mocha;
import org.example.structural.pratice.decorator.exercise2.decorators.Chocolate;
import org.example.structural.pratice.decorator.exercise2.decorators.Milk;
import org.example.structural.pratice.decorator.exercise2.decorators.Sugar;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " → R$" + espresso.getCost());

        // Espresso + leite
        Beverage milkEspresso = new Milk(espresso);
        System.out.println(milkEspresso.getDescription() + " → R$" + milkEspresso.getCost());

        // Latte + chocolate
        Beverage chocoLatte = new Chocolate(new Latte());
        System.out.println(chocoLatte.getDescription() + " → R$" + chocoLatte.getCost());

        // Mocha com tudo
        Beverage superMocha = new Sugar(new Milk(new Chocolate(new Mocha())));
        System.out.println(superMocha.getDescription() + " → R$" + superMocha.getCost());
    }
}