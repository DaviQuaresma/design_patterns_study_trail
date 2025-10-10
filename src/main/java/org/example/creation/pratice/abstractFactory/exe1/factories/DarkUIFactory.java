package org.example.creation.pratice.abstractFactory.exe1.factories;

import org.example.creation.pratice.abstractFactory.exe1.buttons.Button;
import org.example.creation.pratice.abstractFactory.exe1.buttons.DarkButton;
import org.example.creation.pratice.abstractFactory.exe1.inputs.DarkInput;
import org.example.creation.pratice.abstractFactory.exe1.inputs.Input;

public class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Input createInput() {
        return new DarkInput();
    }
}
