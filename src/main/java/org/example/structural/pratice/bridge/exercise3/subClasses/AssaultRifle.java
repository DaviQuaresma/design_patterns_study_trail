package org.example.structural.pratice.bridge.exercise3.subClasses;

import org.example.structural.pratice.bridge.exercise3.AmmoType;
import org.example.structural.pratice.bridge.exercise3.Weapon;

public class AssaultRifle extends Weapon {

    public AssaultRifle(AmmoType ammoType) {
        super(ammoType);
    }

    @Override
    public void shoot() {
        System.out.print("🔫 Rifle de Assalto dispara em rajada... ");
        ammoType.fire("Rifle de Assalto");
    }
}
