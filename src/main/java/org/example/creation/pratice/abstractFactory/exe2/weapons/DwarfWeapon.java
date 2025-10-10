package org.example.creation.pratice.abstractFactory.exe2.weapons;

public class DwarfWeapon implements WeaponFactory{
    @Override
    public void createWeapon() {
        System.out.println("Creating a Dwarf Axe");
    }

    @Override
    public String wieldWeapon() {
        return "Wielding a Dwarf Axe";
    }

    @Override
    public String storeWeapon() {
        return "Storing a Dwarf Axe";
    }
}
