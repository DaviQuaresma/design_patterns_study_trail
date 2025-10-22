package org.example.structural.proxy;

import org.example.structural.proxy.helpers.Point;

import java.util.ArrayList;
import java.util.List;

public class TextDocument {

    private final List<Graphic> graphics = new ArrayList<>();

    public void insert(Graphic graphic) {
        graphics.add(graphic);
    }

    public void render() {
        System.out.println("📝 Renderizando documento...");
        for (Graphic g : graphics) {
            g.draw(Point.of(10, 10));
        }
    }
}
