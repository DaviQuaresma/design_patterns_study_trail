package org.example.structural.pratice.decorator.exercise2.decorators;

import org.example.structural.pratice.decorator.exercise2.components.Beverage;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", com Açúcar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}