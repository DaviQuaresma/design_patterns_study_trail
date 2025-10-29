package org.example.structural.pratice.flyweight.exercise2;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, CharacterType> characterTypes = new HashMap<>();

    public static CharacterType getCharacterType(char symbol, String font, int size) {
        String key = symbol + "-" + font + "-" + size;

        if (!characterTypes.containsKey(key)) {
            characterTypes.put(key, new CharacterType(symbol, font, size));
            System.out.println("Criando novo CharacterType: " + key);
        }

        return characterTypes.get(key);
    }
}