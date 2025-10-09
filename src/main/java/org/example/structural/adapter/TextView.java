package org.example.structural.adapter;

import java.awt.*;

public class TextView {
    public void getOrigin(Point origin) {
        origin.setX(10);
        origin.setY(20);
    }

    public void getExtent(Point extent) {
        extent.setX(100);
        extent.setY(50);
    }

    public boolean isEmpty() {
        return false;
    }
}
