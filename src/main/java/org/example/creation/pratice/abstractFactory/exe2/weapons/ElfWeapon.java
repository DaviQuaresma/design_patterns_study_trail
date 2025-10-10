package org.example.creation.pratice.abstractFactory.exe2.weapons;

public class ElfWeapon implements WeaponFactory{
    @Override
    public void createWeapon() {
        System.out.println("Creating a Elf Bow");
    }

    @Override
    public String wieldWeapon() {
        return "Wielding a Elf Bow";
    }

    @Override
    public String storeWeapon() {
        return "Storing a Elf Bow";
    }
}
