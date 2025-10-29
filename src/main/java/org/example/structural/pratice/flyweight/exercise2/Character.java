package org.example.structural.pratice.flyweight.exercise2;

public class Character {
    private final int x;
    private final int y;
    private final CharacterType type;

    public Character(int x, int y, CharacterType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.render(x, y);
    }
}