package org.example.structural.bridge.implementation;

import org.example.structural.bridge.Point;

public abstract class PMWindowImp extends WindowImp {

    // Estado específico do Presentation Manager (simulado)
    private Object hps;

    public PMWindowImp() {
        this.hps = new Object(); // Simulação
    }

    @Override
    public void impTop() {
        System.out.println("[PMWindowImp] Window brought to top.");
    }

    @Override
    public void impBottom() {
        System.out.println("[PMWindowImp] Window sent to bottom.");
    }

    @Override
    public void impSetExtent(Point extent) {
        System.out.println("[PMWindowImp] Set extent to: " + extent.getX() + ", " + extent.getY());
    }

    @Override
    public void impSetOrigin(Point origin) {
        System.out.println("[PMWindowImp] Set origin to: " + origin.getX() + ", " + origin.getY());
    }

    @Override
    public void deviceRect(float x0, float y0, float x1, float y1) {
        int x = Math.round(Math.min(x0, x1));
        int y = Math.round(Math.min(y0, y1));
        int w = Math.round(Math.abs(x0 - x1));
        int h = Math.round(Math.abs(y0 - y1));

        System.out.printf("[PMWindowImp] Draw rectangle at (%d, %d) with width=%d height=%d%n", x, y, w, h);
    }

    @Override
    public void deviceText(String text, float x, float y) {
        System.out.printf("[PMWindowImp] Draw text '%s' at (%.1f, %.1f)%n", text, x, y);
    }

    @Override
    public void deviceBitmap(String name, float x, float y) {
        System.out.printf("[PMWindowImp] Draw bitmap '%s' at (%.1f, %.1f)%n", name, x, y);
    }
}
