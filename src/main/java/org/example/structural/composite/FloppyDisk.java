package org.example.structural.composite;

public class FloppyDisk extends Equipment {
    public FloppyDisk(String name) {
        super(name);
    }

    @Override
    public double getPower() {
        return 5.0;
    }

    @Override
    public double getNetPrice() {
        return 150.0;
    }

    @Override
    public double getDiscountPrice() {
        return 120.0;
    }
}
