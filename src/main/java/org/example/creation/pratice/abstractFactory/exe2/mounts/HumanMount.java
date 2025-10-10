package org.example.creation.pratice.abstractFactory.exe2.mounts;

public class HumanMount implements MountFactory{
    @Override
    public void createMount() {
        System.out.println("Creating HumanMount");
    }

    @Override
    public String mount() {
        return "You are mounting a strong and fast dark horse";
    }

    @Override
    public String dismount() {
        return "You are dismounting the horse";
    }
}
