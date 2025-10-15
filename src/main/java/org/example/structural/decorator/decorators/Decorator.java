package org.example.structural.decorator.decorators;

import org.example.structural.decorator.components.VisualComponent;

public abstract class Decorator implements VisualComponent {
    protected VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public void resize() {
        component.resize();
    }
}
