package org.example.creation.pratice.factoryMethod.exe3.interfaces;

import org.example.creation.pratice.factoryMethod.exe3.classes.Doc;
import org.example.creation.pratice.factoryMethod.exe3.classes.NFe;

public class NFeCreator extends Doc {
    @Override
    protected DocCreator createDocument() {
        return new NFe();
    }
}
