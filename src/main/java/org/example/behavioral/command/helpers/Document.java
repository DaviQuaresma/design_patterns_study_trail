package org.example.behavioral.command.helpers;

public class Document {
    private final String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void open() {
        System.out.println("Abrindo documento: " + name);
    }

    public void paste() {
        System.out.println("Colando conteúdo no documento: " + name);
    }
}
