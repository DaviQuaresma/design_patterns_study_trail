package org.example.structural.pratice.bridge.exercise2.implementations;

import org.example.structural.pratice.bridge.exercise2.DamageType;

public class FireDamage implements DamageType {

    @Override
    public void applyDamage(String weaponName) {
        System.out.println("🔥 O inimigo é incendiado pelo " + weaponName + "!");
    }
}
