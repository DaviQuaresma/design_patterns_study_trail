package org.example.structural.pratice.bridge.exercise3.subClasses;

import org.example.structural.pratice.bridge.exercise3.AmmoType;
import org.example.structural.pratice.bridge.exercise3.Weapon;

public class Needler extends Weapon {

    public Needler(AmmoType ammoType) {
        super(ammoType);
    }

    @Override
    public void shoot() {
        System.out.print("💠 Needler lança agulhas brilhantes... ");
        ammoType.fire("Needler");
    }
}
