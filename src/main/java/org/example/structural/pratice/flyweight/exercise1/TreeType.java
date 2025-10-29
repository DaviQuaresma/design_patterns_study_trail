package org.example.structural.pratice.flyweight.exercise1;

public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Desenhando árvore '" + name + "' cor " + color +
                " textura " + texture + " em (" + x + "," + y + ")");
    }
}