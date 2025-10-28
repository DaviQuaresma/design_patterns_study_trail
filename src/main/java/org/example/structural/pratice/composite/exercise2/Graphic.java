package org.example.structural.pratice.composite.exercise2;

import java.awt.*;

public interface Graphic {
    void draw();
    void add(Graphic g);
    void remove(Graphic g);
}
