package org.example.creation.pratice.factoryMethod.exe3.classes;

import org.example.creation.pratice.factoryMethod.exe3.interfaces.DocCreator;

public class NFe implements DocCreator {

    @Override
    public void generateXML() {
        System.out.println("Generating NFe");
    }

    @Override
    public void transmit() {
        System.out.println("Transmitting NFe");
    }
}
