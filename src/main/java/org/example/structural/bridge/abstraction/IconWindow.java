package org.example.structural.bridge.abstraction;

import org.example.structural.bridge.View;
import org.example.structural.bridge.implementation.WindowImp;
import org.example.structural.bridge.Point;

public class IconWindow extends Window {
    private String bitmapName;

    public IconWindow(View contents, String bitmapName) {
        super(contents);
        this.bitmapName = bitmapName;
    }

    @Override
    public void drawContents() {
        WindowImp imp = getWindowImp();
        if (imp != null) {
            imp.deviceBitmap(bitmapName, 0, 0); // <-- apenas 3 parâmetros agora
        }
    }

    public void drawRect(Point p1, Point p2) {
        WindowImp imp = getWindowImp();
        if (imp != null) {
            imp.deviceRect(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        }
    }

    public WindowImp getWindowImp() {
        return imp;
    }
}
