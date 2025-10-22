package org.example.structural.flyweight.helpers;

import org.example.structural.flyweight.Glyph;
import org.example.structural.flyweight.GlyphContext;

import java.util.ArrayList;
import java.util.List;

// Estrutura composta (Composite Pattern junto com Flyweight).

public class Row extends Glyph {

    private final List<Glyph> children = new ArrayList<>();

    public void add(Glyph glyph) {
        children.add(glyph);
    }

    @Override
    public void draw(Window window, GlyphContext context) {
        System.out.println("Desenhando linha...");
        for (Glyph glyph : children) {
            glyph.draw(window, context);
        }
    }
}
