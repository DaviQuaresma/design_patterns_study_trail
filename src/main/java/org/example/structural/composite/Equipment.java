package org.example.structural.composite;

import java.util.List;

public abstract class Equipment {
    protected String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPower();
    public abstract double getNetPrice();
    public abstract double getDiscountPrice();

    // Métodos padrão — só são usados nos compostos
    public void add(Equipment e) {
        throw new UnsupportedOperationException("Não é um componente composto");
    }

    public void remove(Equipment e) {
        throw new UnsupportedOperationException("Não é um componente composto");
    }

    public List<Equipment> getEquipments() {
        throw new UnsupportedOperationException("Não é um componente composto");
    }
}
