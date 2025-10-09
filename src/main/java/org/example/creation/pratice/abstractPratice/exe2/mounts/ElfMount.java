package org.example.creation.pratice.abstractPratice.exe2.mounts;

public class ElfMount implements MountFactory{
    @Override
    public void createMount() {
        System.out.println("Creating ElfMount");
    }

    @Override
    public String mount() {
        return "You are mounting a magnificent white horse";
    }

    @Override
    public String dismount() {
        return "You are dismounting the horse";
    }
}
