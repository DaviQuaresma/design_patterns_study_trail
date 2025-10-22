package org.example.structural.proxy;

import org.example.structural.proxy.helpers.Event;
import org.example.structural.proxy.helpers.Point;

public class Image implements Graphic {

    private final String fileName;
    private Point extend = Point.of(1920, 1080);

    public Image(String fileName) {
        this.fileName = fileName;
        load(fileName);
    }

    @Override
    public void draw(Point at) {
        System.out.println("🖼️ Desenhando imagem real '" + fileName + "' em " + at);
    }

    @Override
    public void handleMouse(Event event) {
        System.out.println("🎯 Imagem '" + fileName + "' recebeu evento: " + event.getType());
    }

    @Override
    public Point getExtent() {
        return extend;
    }

    @Override
    public void load(String from) {
        System.out.println("📂 Carregando imagem pesada de disco: " + from);
    }

    @Override
    public void save(String to) {
        System.out.println("💾 Salvando imagem para: " + to);
    }
}
