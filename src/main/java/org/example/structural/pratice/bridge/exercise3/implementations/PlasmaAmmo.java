package org.example.structural.pratice.bridge.exercise3.implementations;

import org.example.structural.pratice.bridge.exercise3.AmmoType;

public class PlasmaAmmo implements AmmoType {

    @Override
    public void fire(String weaponName) {
        System.out.println("🔥 " + weaponName + " queima o inimigo com plasma superaquecido!");
    }
}