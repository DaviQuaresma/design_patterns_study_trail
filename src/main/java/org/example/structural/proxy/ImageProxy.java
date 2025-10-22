package org.example.structural.proxy;

import org.example.structural.proxy.helpers.Event;
import org.example.structural.proxy.helpers.Point;

public class ImageProxy implements Graphic {

    private Image image;              // Referência real (lazy-loaded)
    private Point extent = Point.ZERO; // cache de dimensão
    private final String fileName;     // nome do arquivo

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    private Image getImage() {
        if (image == null) {
            image = new Image(fileName);
        }
        return image;
    }

    @Override
    public void draw(Point at) {
        getImage().draw(at); // delega para o objeto real
    }

    @Override
    public void handleMouse(Event event) {
        getImage().handleMouse(event);
    }

    @Override
    public Point getExtent() {
        if (extent.equals(Point.ZERO)) {
            extent = getImage().getExtent();
        }
        return extent;
    }

    @Override
    public void load(String from) {
        System.out.println("Proxy carregando metadados da imagem: " + from);
    }

    @Override
    public void save(String to) {
        System.out.println("Proxy salvando referência da imagem '" + fileName + "' para: " + to);
    }
}
