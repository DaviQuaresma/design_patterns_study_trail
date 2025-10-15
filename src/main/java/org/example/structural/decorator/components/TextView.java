package org.example.structural.decorator.components;

public class TextView implements VisualComponent {

    @Override
    public void draw() {
        System.out.println("Desenhando TextView");
    }

    @Override
    public void resize() {
        System.out.println("Redimensionando TextView");
    }
}
