package org.example.structural.decorator.decorators;

import org.example.structural.decorator.components.VisualComponent;

public class BorderDecorator extends Decorator {
    private int borderWidth;

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder(borderWidth);
    }

    private void drawBorder(int width) {
        System.out.println("Desenhando borda de " + width + "px");
    }
}

