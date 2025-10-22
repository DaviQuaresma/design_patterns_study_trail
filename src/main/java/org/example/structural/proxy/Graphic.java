package org.example.structural.proxy;

import org.example.structural.proxy.helpers.Event;
import org.example.structural.proxy.helpers.Point;

public interface Graphic {
    void draw(Point at);
    void handleMouse(Event event);
    Point getExtent();
    void load(String from);
    void save(String to);
}
