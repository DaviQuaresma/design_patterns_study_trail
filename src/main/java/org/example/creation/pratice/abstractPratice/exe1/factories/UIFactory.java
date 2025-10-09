package org.example.creation.pratice.abstractPratice.exe1.factories;

import org.example.creation.pratice.abstractPratice.exe1.buttons.Button;
import org.example.creation.pratice.abstractPratice.exe1.inputs.Input;


public interface UIFactory {
    Button createButton();
    Input createInput();
}
