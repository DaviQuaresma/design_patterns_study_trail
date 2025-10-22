package org.example.structural.flyweight;

import org.example.structural.flyweight.helpers.Font;

import java.util.HashMap;
import java.util.Map;

// Contexto Extrinseco ( não é FlyWeight ) - Armazena dados extrínsecos (fonte, posição etc).

public class GlyphContext {

    private int index;
    private final Map<Integer, Font> fonts = new HashMap<>();

    public void next(int step) {
        index += step;
    }

    public void insert(int quantity) {
        // movimenta o índice (simula inserção)
        index += quantity;
    }

    public Font getFont() {
        return fonts.getOrDefault(index, new Font("Default"));
    }

    public void setFont(Font font, int span) {
        fonts.put(index, font);
    }
}
