package org.example.structural.pratice.decorator.exercise1.decorators;

import org.example.structural.pratice.decorator.exercise1.components.VisualComponent;

public class EncryptedInput extends Decorator {
    private int size;

    public EncryptedInput(VisualComponent component, int size) {
        super(component);
        this.size = size;
    }

    @Override
    public void draw() {
        super.draw();
        drawEncryptedInput(size);
    }

    private void drawEncryptedInput(int size) {
        System.out.println("🔒 Adicionando criptografia ao input (campo de " + size + " caracteres)");
    }
}
