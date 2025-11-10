package org.example.creation.pratice.factoryMethod.exe3.classes;

import org.example.creation.pratice.factoryMethod.exe3.interfaces.DocCreator;

public abstract class Doc {
    public void emitDocument() {
        DocCreator doc = createDocument();
        doc.transmit();
        doc.generateXML();
    }

    protected abstract DocCreator createDocument();
}
