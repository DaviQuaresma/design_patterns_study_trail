package org.example.structural.pratice.facade.exercise2;

/*
📦 Ex 2 — Upload de arquivo na nuvem

Contexto:
Enviar arquivos envolve autenticação, compressão e upload multipart.

Desafio:
Crie CloudStorageFacade que esconda as dependências (AuthService, Compressor, Uploader).

Vantagem:
Fornece interface única pra subsistemas complexos.
 */

public class Main {
    public static void main(String[] args) {
        CloudStorageFacade cloud1 = new CloudStorageFacade();
        System.out.println(cloud1.finalUpload("davi.henrques", "Davi09022002", "image124124", "png"));
    }
}
