package org.example.structural.bridge.abstraction;

import org.example.structural.bridge.View;

// Subclasse que representa uma janela de aplicação
public class ApplicationWindow extends Window {

    public ApplicationWindow(View contents) {
        super(contents);
    }

    @Override
    public void drawContents() {
        if (contents != null) {
            contents.drawOn(this);
        }
    }
}
