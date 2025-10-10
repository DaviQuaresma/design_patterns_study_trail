package org.example.creation.pratice.abstractFactory.exe2.weapons;

public class HumanWeapon implements WeaponFactory{
    @Override
    public void createWeapon() {
        System.out.println("Creating a Human Sword");
    }

    @Override
    public String wieldWeapon() {
        return "Wielding a Human Sword";
    }

    @Override
    public String storeWeapon() {
        return "Storing a Human Sword";
    }
}
