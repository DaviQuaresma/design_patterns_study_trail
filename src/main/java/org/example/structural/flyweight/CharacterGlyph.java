package org.example.structural.flyweight;

import org.example.structural.flyweight.helpers.Window;

// Flyweight concreto — compartilha dados intrínsecos (charCode).
public class CharacterGlyph extends Glyph {

    private final char charCode;

    public CharacterGlyph(char charCode) {
        this.charCode = charCode;
    }

    @Override
    public void draw(Window window, GlyphContext context) {
        System.out.println("Desenhando caractere '" + charCode + "' com fonte: "
                + context.getFont());
    }
}
