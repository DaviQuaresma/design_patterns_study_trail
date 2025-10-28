package org.example.structural.pratice.bridge.exercise2.subclasses;

import org.example.structural.pratice.bridge.exercise2.DamageType;
import org.example.structural.pratice.bridge.exercise2.Weapon;

public class Sword extends Weapon {

    public Sword(DamageType damageType) {
        super(damageType);
    }

    @Override
    public void attack() {
        System.out.print("A espada golpeia o inimigo... ");
        damageType.applyDamage("Espada");
    }
}