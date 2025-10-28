package org.example.structural.pratice.composite.exercise2;

public class Rectangle implements Graphic {
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando retângulo: " + name);
    }

    @Override
    public void add(Graphic g) {
        throw new UnsupportedOperationException("Retângulo não pode conter outros objetos.");
    }

    @Override
    public void remove(Graphic g) {
        throw new UnsupportedOperationException("Retângulo não pode conter outros objetos.");
    }
}