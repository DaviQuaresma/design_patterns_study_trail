package org.example.structural.flyweight.helpers;

public class Font {

    private final String name;

    public Font(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
