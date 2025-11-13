package org.example.behavioral.command.helpers;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private final List<Document> documents = new ArrayList<>();

    public void add(Document doc) {
        documents.add(doc);
        System.out.println("Documento adicionado: " + doc.getName());
    }
}
