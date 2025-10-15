package org.example.structural.composite;

public class Main {
    public static void main(String[] args) {
        Equipment floppy1 = new FloppyDisk("Floppy A");
        Equipment floppy2 = new FloppyDisk("Floppy B");

        CompositeEquipment chassis = new Chassis("Chassis Principal");
        chassis.add(floppy1);
        chassis.add(floppy2);

        System.out.println("Equipamento: " + chassis.getName());
        System.out.println("Potência total: " + chassis.getPower() + " W");
        System.out.println("Preço total: R$ " + chassis.getNetPrice());
        System.out.println("Preço com desconto: R$ " + chassis.getDiscountPrice());
    }
}

