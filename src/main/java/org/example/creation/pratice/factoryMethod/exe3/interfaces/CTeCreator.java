package org.example.creation.pratice.factoryMethod.exe3.interfaces;

import org.example.creation.pratice.factoryMethod.exe3.classes.CTe;
import org.example.creation.pratice.factoryMethod.exe3.classes.Doc;

public class CTeCreator extends Doc {
    @Override
    protected DocCreator createDocument() {
        return new CTe();
    }
}
