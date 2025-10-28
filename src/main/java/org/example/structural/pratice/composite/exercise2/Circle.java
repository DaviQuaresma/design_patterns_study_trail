package org.example.structural.pratice.composite.exercise2;

public class Circle implements Graphic {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando círculo: " + name);
    }

    @Override
    public void add(Graphic g) {
        throw new UnsupportedOperationException("Círculo não pode conter outros objetos.");
    }

    @Override
    public void remove(Graphic g) {
        throw new UnsupportedOperationException("Círculo não pode conter outros objetos.");
    }
}