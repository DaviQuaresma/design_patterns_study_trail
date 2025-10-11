package org.example.structural.bridge;

import org.example.structural.bridge.abstraction.IconWindow;
import org.example.structural.bridge.abstraction.Window;
import org.example.structural.bridge.implementation.XWindowImp;

public class Main {
    public static void main(String[] args) {
        Window window = new IconWindow(new View(), "icon.png");
        window.setWindowImp(new XWindowImp());

        // desenha um retângulo
        window.drawRect(new Point(10, 10), new Point(100, 50));

        // desenha conteúdo (bitmap)
        window.drawContents();
    }
}
