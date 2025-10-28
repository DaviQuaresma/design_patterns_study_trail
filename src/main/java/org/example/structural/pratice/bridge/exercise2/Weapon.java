package org.example.structural.pratice.bridge.exercise2;

public abstract class Weapon {
    protected DamageType damageType;

    public Weapon(DamageType damageType) {
        this.damageType = damageType;
    }

    public abstract void attack();
}