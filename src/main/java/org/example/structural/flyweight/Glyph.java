package org.example.structural.flyweight;

import org.example.structural.flyweight.helpers.Font;
import org.example.structural.flyweight.helpers.Window;

// Flyweight abstrato - Classe abstrata (Flyweight base). Define interface comum.
public abstract class Glyph {

    public abstract void draw(Window window, GlyphContext context);

    public void setFont(Font font, GlyphContext context) {
        // comportamento padrão — subclasses podem sobrescrever
    }

    public Font getFont(GlyphContext context) {
        return null;
    }

    public void first(GlyphContext context) {}
    public void next(GlyphContext context) {}
    public boolean isDone(GlyphContext context) { return true; }
    public Glyph current(GlyphContext context) { return null; }

    public void insert(Glyph glyph, GlyphContext context) {}
    public void remove(GlyphContext context) {}
}
