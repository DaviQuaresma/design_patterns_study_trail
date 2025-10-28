package org.example.structural.pratice.bridge.exercise3.subClasses;

import org.example.structural.pratice.bridge.exercise3.AmmoType;
import org.example.structural.pratice.bridge.exercise3.Weapon;

public class PlasmaRifle extends Weapon {

    public PlasmaRifle(AmmoType ammoType) {
        super(ammoType);
    }

    @Override
    public void shoot() {
        System.out.print("⚡ Rifle de Plasma carrega energia... ");
        ammoType.fire("Rifle de Plasma");
    }
}