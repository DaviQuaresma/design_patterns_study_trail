package org.example.creation.pratice.prototype.exe1;

/*
🧟 Ex 1 — Clonagem de NPCs

Contexto:
Em um jogo, criar NPCs complexos é caro — mas eles só mudam o nome e cor da roupa.

Desafio:
Crie um NPC que implementa clone().
Clone instâncias para gerar novos NPCs rapidamente mudando pequenas coisas.

Vantagem:
Evita custo alto de inicialização.
 */

public class Main {
    public static void main(String[] args) {
        NpcHuman npcBase = new NpcHuman("Warrior", 100, "Heavy Armor");
        System.out.println("Npc Base 1: " + npcBase);

        NpcHuman npcClone1 = (NpcHuman) npcBase.clonar();
        npcClone1.setName("Warrior Blue");
        npcClone1.setClothes("Light Armor");

        NpcHuman npcClone2 = (NpcHuman) npcBase.clonar();
        npcClone2.setName("Warrior Red");
        npcClone2.setClothes("Medium Armor");

        NpcHuman npcClone3 = (NpcHuman) npcBase.clonar();
        npcClone3.setName("Warrior Yellow");
        npcClone3.setClothes("No Armor");

        System.out.println("\n Npcs clonados: ");
        System.out.println("Npc Base: " + npcBase);
        System.out.println("Npc clone 1: " + npcClone1);
        System.out.println("Npc clone 2: " + npcClone2);
        System.out.println("Npc clone 3: " + npcClone3);
    }
}
