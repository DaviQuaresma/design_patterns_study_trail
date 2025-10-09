package org.example.structural.adapter;

public class TextManipulator implements Manipulator {
    private TextShape textShape;

    public TextManipulator(TextShape textShape) {
        this.textShape = textShape;
    }

    @Override
    public void move() {
        System.out.println("Movendo o texto...");
    }

    @Override
    public void resize() {
        System.out.println("Redimensionando o texto...");
    }
}