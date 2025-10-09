package org.example.creation.pratice.abstractPratice.exe2.factories;

import org.example.creation.pratice.abstractPratice.exe2.mounts.DwarfMount;
import org.example.creation.pratice.abstractPratice.exe2.weapons.DwarfWeapon;

public class DwarfFactory implements RaceFactory{
    @Override
    public DwarfWeapon createWeapon() {
        return new DwarfWeapon();
    }

    @Override
    public DwarfMount createMount() {
        return new DwarfMount();
    }

    @Override
    public String Greatings() {
        return "I've come from the mines, wielding an Axe with an arm and with another a Pickaxe !!!";
    }
}
