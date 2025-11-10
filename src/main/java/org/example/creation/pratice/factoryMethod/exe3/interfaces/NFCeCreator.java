package org.example.creation.pratice.factoryMethod.exe3.interfaces;

import org.example.creation.pratice.factoryMethod.exe3.classes.Doc;
import org.example.creation.pratice.factoryMethod.exe3.classes.NFCe;

public class NFCeCreator extends Doc {
    @Override
    protected DocCreator createDocument() {
        return new NFCe();
    }
}
