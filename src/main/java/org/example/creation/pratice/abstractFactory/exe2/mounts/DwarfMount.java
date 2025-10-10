package org.example.creation.pratice.abstractFactory.exe2.mounts;

public class DwarfMount implements MountFactory{
    @Override
    public void createMount() {
        System.out.println("Creating DwarfMount");
    }

    @Override
    public String mount() {
        return "You are mounting a Big boar with iron armor";
    }

    @Override
    public String dismount() {
        return "You are dismounting the big boar";
    }
}
