package org.example.structural.pratice.decorator.exercise2.concrete;

import org.example.structural.pratice.decorator.exercise2.components.Beverage;

public class Latte implements Beverage {
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getCost() {
        return 6.50;
    }
}