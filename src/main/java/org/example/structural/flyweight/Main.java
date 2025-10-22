package org.example.structural.flyweight;

import org.example.structural.flyweight.helpers.Font;
import org.example.structural.flyweight.helpers.Row;
import org.example.structural.flyweight.helpers.Window;

public class Main {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
        GlyphContext context = new GlyphContext();
        Window window = new Window();

        // Criando glifos com compartilhamento
        CharacterGlyph a1 = factory.createCharacter('A');
        CharacterGlyph a2 = factory.createCharacter('A');
        CharacterGlyph b1 = factory.createCharacter('B');

        System.out.println("a1 == a2 ? " + (a1 == a2)); // true (mesma instância)
        System.out.println("a1 == b1 ? " + (a1 == b1)); // false

        // Montando linha de texto
        Row row = factory.createRow();
        row.add(a1);
        row.add(b1);
        row.add(a2);

        // Configurando fonte extrínseca
        context.setFont(new Font("Arial"), 0);

        // Desenhando tudo
        row.draw(window, context);
    }
}
