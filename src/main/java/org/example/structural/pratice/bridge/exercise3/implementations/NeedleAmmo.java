package org.example.structural.pratice.bridge.exercise3.implementations;

import org.example.structural.pratice.bridge.exercise3.AmmoType;

public class NeedleAmmo implements AmmoType {

    @Override
    public void fire(String weaponName) {
        System.out.println("💥 " + weaponName + " causa uma explosão de agulhas cor-de-rosa!");
    }
}