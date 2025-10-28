package org.example.structural.pratice.decorator.exercise1.components;

public class InputField implements  VisualComponent {
    @Override
    public void draw() {
        System.out.println("draw");
    }

    @Override
    public void resize() {
        System.out.println("resize");
    }
}
