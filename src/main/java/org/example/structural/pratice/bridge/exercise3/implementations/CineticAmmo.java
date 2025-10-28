package org.example.structural.pratice.bridge.exercise3.implementations;

import org.example.structural.pratice.bridge.exercise3.AmmoType;

public class CineticAmmo implements AmmoType {

    @Override
    public void fire(String weaponName) {
        System.out.println("💥 " + weaponName + " perfura o inimigo com balas cinéticas!");
    }
}