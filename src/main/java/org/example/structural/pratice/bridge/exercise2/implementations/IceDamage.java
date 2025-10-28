package org.example.structural.pratice.bridge.exercise2.implementations;

import org.example.structural.pratice.bridge.exercise2.DamageType;

public class IceDamage implements DamageType {
    @Override
    public void applyDamage(String weaponName) {
        System.out.println("❄️ O inimigo congela ao ser atingido pelo " + weaponName + "!");
    }
}
