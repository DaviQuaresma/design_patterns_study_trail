package org.example.structural.flyweight;

import org.example.structural.flyweight.helpers.Column;
import org.example.structural.flyweight.helpers.Row;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory — garante compartilhamento de objetos.

public class GlyphFactory {

    private final Map<Character, CharacterGlyph> characters = new HashMap<>();

    public CharacterGlyph createCharacter(char c) {
        // reutiliza o mesmo objeto se já existir
        if (!characters.containsKey(c)) {
            characters.put(c, new CharacterGlyph(c));
        }
        return characters.get(c);
    }

    public Row createRow() {
        return new Row();
    }

    public Column createColumn() {
        return new Column();
    }
}
