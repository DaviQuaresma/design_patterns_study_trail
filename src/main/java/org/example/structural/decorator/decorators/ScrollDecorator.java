package org.example.structural.decorator.decorators;

import org.example.structural.decorator.components.VisualComponent;

public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawScroll();
    }

    private void drawScroll() {
        System.out.println("Adicionando barras de rolagem");
    }
}
