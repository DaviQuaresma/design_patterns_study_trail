package org.example.creation.pratice.abstractPratice.exe1.buttons;

public class LightButton implements Button {
    @Override
    public void renderer() {
        System.out.println("LightButton.renderer");
    }

    @Override
    public String click() {
        return "LightButton.click";
    }
}
