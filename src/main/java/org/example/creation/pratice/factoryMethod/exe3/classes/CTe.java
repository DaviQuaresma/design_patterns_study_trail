package org.example.creation.pratice.factoryMethod.exe3.classes;

import org.example.creation.pratice.factoryMethod.exe3.interfaces.DocCreator;

public class CTe implements DocCreator {

    @Override
    public void generateXML() {
        System.out.println("CTe generateXML");
    }

    @Override
    public void transmit() {
        System.out.println("CTe transmit");
    }
}
