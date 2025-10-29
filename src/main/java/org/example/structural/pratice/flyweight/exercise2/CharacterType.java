package org.example.structural.pratice.flyweight.exercise2;

public class CharacterType {
    private final char symbol;
    private final String font;
    private final int size;

    public CharacterType(char symbol, String font, int size) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
    }

    public void render(int x, int y) {
        System.out.println(
                "Renderizando '" + symbol + "' na fonte " + font +
                        ", tamanho " + size + " em (" + x + "," + y + ")"
        );
    }
}
