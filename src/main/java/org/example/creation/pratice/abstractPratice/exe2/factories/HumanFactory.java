package org.example.creation.pratice.abstractPratice.exe2.factories;

import org.example.creation.pratice.abstractPratice.exe2.mounts.HumanMount;
import org.example.creation.pratice.abstractPratice.exe2.weapons.HumanWeapon;

public class HumanFactory implements RaceFactory{
    @Override
    public HumanWeapon createWeapon() {
        return new HumanWeapon();
    }

    @Override
    public HumanMount createMount() {
        return new HumanMount();
    }

    @Override
    public String Greatings(){
        return "Hi my friend, I can show how to manage a Sword, but... you'll never be better than me.";
    }
}
