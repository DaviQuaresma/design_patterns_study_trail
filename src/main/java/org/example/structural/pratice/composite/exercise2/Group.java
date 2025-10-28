package org.example.structural.pratice.composite.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Group implements Graphic {
    private String name;
    private final List<Graphic> children = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Group " + name);
        for (Graphic g : children) {
            g.draw();
        }
    }

    @Override
    public void add(Graphic g) {
        children.add(g);
    }

    @Override
    public void remove(Graphic g) {
        children.remove(g);
    }
}
