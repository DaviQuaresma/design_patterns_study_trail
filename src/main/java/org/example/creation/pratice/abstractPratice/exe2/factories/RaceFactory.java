package org.example.creation.pratice.abstractPratice.exe2.factories;

import org.example.creation.pratice.abstractPratice.exe2.mounts.MountFactory;
import org.example.creation.pratice.abstractPratice.exe2.weapons.WeaponFactory;

public interface RaceFactory {
    WeaponFactory createWeapon();
    MountFactory createMount();
    String Greatings();
}
