package org.example.structural.proxy;

import org.example.structural.proxy.helpers.Event;

public class Main {
    public static void main(String[] args) {

        TextDocument text = new TextDocument();

        // Proxy é criado, mas a imagem real ainda não foi carregada!
        Graphic imageProxy = new ImageProxy("anImageFileName.png");

        text.insert(imageProxy);

        System.out.println("Documento criado, mas imagem ainda não carregada.");

        // Quando desenhamos, a imagem real é instanciada (lazy loading)
        text.render();

        // Segunda chamada reaproveita o cache
        text.render();

        // Teste de evento
        imageProxy.handleMouse(new Event("click"));
    }
}
