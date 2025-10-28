package org.example.structural.pratice.decorator.exercise2.concrete;

import org.example.structural.pratice.decorator.exercise2.components.Beverage;

public class Mocha implements Beverage {
    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public double getCost() {
        return 7.00;
    }
}