package org.example.structural.pratice.decorator.exercise2.decorators;

import org.example.structural.pratice.decorator.exercise2.components.Beverage;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", com Leite";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.50;
    }
}