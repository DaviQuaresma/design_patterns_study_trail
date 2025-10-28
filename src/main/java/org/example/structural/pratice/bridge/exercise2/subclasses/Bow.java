package org.example.structural.pratice.bridge.exercise2.subclasses;

import org.example.structural.pratice.bridge.exercise2.DamageType;
import org.example.structural.pratice.bridge.exercise2.Weapon;

public class Bow extends Weapon {

    public Bow(DamageType damageType) {
        super(damageType);
    }

    @Override
    public void attack() {
        System.out.print("O arco dispara uma flecha... ");
        damageType.applyDamage("Arco");
    }
}