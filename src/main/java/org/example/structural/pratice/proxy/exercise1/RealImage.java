package org.example.structural.pratice.proxy.exercise1;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // simula o carregamento pesado
    }

    private void loadFromDisk() {
        System.out.println("Carregando imagem real do disco: " + fileName);
        try {
            Thread.sleep(1000); // simula tempo de I/O
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("Exibindo imagem: " + fileName);
    }
}
