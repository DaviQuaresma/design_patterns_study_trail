package org.example.structural.pratice.bridge.exercise3;

public abstract class Weapon {
    protected AmmoType ammoType;

    public Weapon(AmmoType ammoType) {
        this.ammoType = ammoType;
    }

    public abstract void shoot();
}
