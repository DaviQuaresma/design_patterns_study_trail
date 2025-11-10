package org.example.creation.pratice.factoryMethod.exe4;

/*
🕹️ Exercício 4 — Sistema de criação de inimigos em um jogo RPG
🎯 Contexto

Seu jogo tem inimigos com diferentes comportamentos:

Orc → ataca corpo a corpo
Archer → ataca à distância
Mage → lança feitiços

O mapa tem regiões que decidem qual tipo de inimigo será gerado.
Você quer que cada região (floresta, deserto, caverna) crie seus inimigos automaticamente, sem depender de código fixo.
 */

import org.example.creation.pratice.factoryMethod.exe4.creator.DesertRegion;
import org.example.creation.pratice.factoryMethod.exe4.creator.ForestRegion;
import org.example.creation.pratice.factoryMethod.exe4.creator.Region;

public class Main {
    public static void main(String[] args) {
        Region forest = new ForestRegion();
        Region desert = new DesertRegion();

        forest.spawnEnemy();
        desert.spawnEnemy();

    }
}
