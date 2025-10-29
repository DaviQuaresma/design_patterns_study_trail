package org.example.structural.pratice.flyweight.exercise2;

/*
💻 Ex 2 — Editor de texto com glifos

Contexto:
Cada caractere tem a mesma fonte e estilo, mas diferentes posições.

Desafio:
Implemente Character como flyweight que compartilha fonte e tamanho.
Cada instância só armazena posição (extrínseco).

Vantagem:
Alta eficiência em estruturas repetitivas (ex: render de texto).
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> text = new ArrayList<>();

        text.add(new Character(0, 0, CharacterFactory.getCharacterType('H', "Arial", 12)));
        text.add(new Character(10, 0, CharacterFactory.getCharacterType('e', "Arial", 12)));
        text.add(new Character(20, 0, CharacterFactory.getCharacterType('l', "Arial", 12)));
        text.add(new Character(30, 0, CharacterFactory.getCharacterType('l', "Arial", 12)));
        text.add(new Character(40, 0, CharacterFactory.getCharacterType('o', "Arial", 12)));

        text.forEach(Character::draw);
    }
}