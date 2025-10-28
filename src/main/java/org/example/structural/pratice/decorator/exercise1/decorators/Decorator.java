package org.example.structural.pratice.decorator.exercise1.decorators;

import org.example.structural.pratice.decorator.exercise1.components.VisualComponent;

public abstract class Decorator implements VisualComponent {
    protected VisualComponent component;

    protected Decorator(VisualComponent component) {
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
