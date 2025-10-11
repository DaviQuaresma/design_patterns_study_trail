package org.example.structural.bridge.implementation;

import org.example.structural.bridge.Point;

public abstract class WindowImp {

    public abstract void impTop();
    public abstract void impBottom();
    public abstract void impSetExtent(Point extent);
    public abstract void impSetOrigin(Point origin);

    public abstract void deviceRect(float x0, float y0, float x1, float y1);
    public abstract void deviceText(String text, float x, float y);
    public abstract void deviceBitmap(String name, float x, float y); // <-- 3 parâmetros

    protected WindowImp() {}
}
