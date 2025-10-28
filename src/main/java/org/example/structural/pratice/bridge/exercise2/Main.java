package org.example.structural.pratice.bridge.exercise2;

/*
🎮 Ex 2 — Armas com diferentes tipos de dano

Contexto:
Em um RPG, há diferentes armas (Sword, Bow) e tipos de dano (FireDamage, IceDamage).

Desafio:
Use Bridge pra conectar Weapon ↔ DamageType.
Ex: uma Sword pode usar FireDamage, e um Bow pode usar IceDamage.

Vantagem:
Combinações ilimitadas sem explosão de subclasses.
 */

import org.example.structural.pratice.bridge.exercise2.implementations.FireDamage;
import org.example.structural.pratice.bridge.exercise2.implementations.IceDamage;
import org.example.structural.pratice.bridge.exercise2.subclasses.Bow;
import org.example.structural.pratice.bridge.exercise2.subclasses.Sword;

public class Main {
    public static void main(String[] args) {
        Weapon swordFire = new Sword(new FireDamage());
        Weapon swordIce = new Sword(new IceDamage());
        Weapon bowFire = new Bow(new FireDamage());
        Weapon bowIce = new Bow(new IceDamage());

        swordFire.attack();
        swordIce.attack();
        bowFire.attack();
        bowIce.attack();
    }
}
