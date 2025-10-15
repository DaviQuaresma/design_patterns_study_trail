package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeEquipment extends Equipment {
    protected List<Equipment> equipments = new ArrayList<>();

    public CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public void add(Equipment e) {
        equipments.add(e);
    }

    @Override
    public void remove(Equipment e) {
        equipments.remove(e);
    }

    @Override
    public List<Equipment> getEquipments() {
        return equipments;
    }

    @Override
    public double getPower() {
        return equipments.stream().mapToDouble(Equipment::getPower).sum();
    }

    @Override
    public double getNetPrice() {
        return equipments.stream().mapToDouble(Equipment::getNetPrice).sum();
    }

    @Override
    public double getDiscountPrice() {
        double total = equipments.stream().mapToDouble(Equipment::getDiscountPrice).sum();
        return total * 0.95; // 5% de desconto adicional
    }
}
