package org.example.creation.pratice.factoryMethod.exe2;

/*
🎮 Ex 2 — Criação de inimigos em jogo

Contexto:
Um jogo precisa gerar inimigos (Orc, Troll, Goblin) dependendo do mapa.

Desafio:
Crie uma classe GameMap com método fábrica spawnEnemy().
Subclasses ForestMap, CaveMap e SwampMap retornam inimigos diferentes.

Vantagem:
Facilita a expansão do jogo sem mudar o código base do mapa.
 */

import org.example.creation.pratice.factoryMethod.exe2.classes.CaveMap;
import org.example.creation.pratice.factoryMethod.exe2.classes.ForestMap;
import org.example.creation.pratice.factoryMethod.exe2.classes.GameMap;
import org.example.creation.pratice.factoryMethod.exe2.classes.SwampMap;

public class Main {
    public static void main(String[] args)
    {
        GameMap swamp = new SwampMap();
        GameMap forest = new ForestMap();
        GameMap cave = new CaveMap();

        System.out.println("\n🌫️ Swamp spawn");
        swamp.spawnNewEnemy();

        System.out.println("\n🌲 Forest spawn");
        forest.spawnNewEnemy();

        System.out.println("\n⛰️ Cave spawn");
        cave.spawnNewEnemy();
    }
}
