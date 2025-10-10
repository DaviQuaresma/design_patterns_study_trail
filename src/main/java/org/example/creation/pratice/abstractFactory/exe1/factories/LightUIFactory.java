package org.example.creation.pratice.abstractFactory.exe1.factories;

import org.example.creation.pratice.abstractFactory.exe1.buttons.Button;
import org.example.creation.pratice.abstractFactory.exe1.buttons.LightButton;
import org.example.creation.pratice.abstractFactory.exe1.inputs.Input;
import org.example.creation.pratice.abstractFactory.exe1.inputs.LightInput;

public class LightUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Input createInput() {
        return new LightInput();
    }
}
