package org.example.structural.pratice.decorator.exercise2.decorators;

import org.example.structural.pratice.decorator.exercise2.components.Beverage;

public class Chocolate extends BeverageDecorator {

    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", com Chocolate";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.00;
    }
}