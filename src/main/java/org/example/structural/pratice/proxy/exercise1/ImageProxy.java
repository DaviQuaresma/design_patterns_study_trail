package org.example.structural.pratice.proxy.exercise1;

public class ImageProxy implements Image {
    private RealImage realImage;
    private final String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // só carrega a imagem real quando necessário
        if (realImage == null) {
            realImage = new RealImage(fileName);
        } else {
            System.out.println("(cache) Imagem já carregada: " + fileName);
        }
        realImage.display();
    }
}
