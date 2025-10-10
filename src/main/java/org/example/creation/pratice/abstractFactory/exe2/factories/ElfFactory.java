package org.example.creation.pratice.abstractFactory.exe2.factories;

import org.example.creation.pratice.abstractFactory.exe2.mounts.ElfMount;
import org.example.creation.pratice.abstractFactory.exe2.weapons.ElfWeapon;

public class ElfFactory implements RaceFactory{
    @Override
    public ElfWeapon createWeapon() {
        return new ElfWeapon();
    }

    @Override
    public ElfMount createMount() {
        return new ElfMount();
    }

    @Override
    public String Greatings(){
        return "Greetings traveler! I'am a high elf with a long bow I can hit a target in miles away, my aim is the best in the forest.";
    }
}
