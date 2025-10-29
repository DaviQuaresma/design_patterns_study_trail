package org.example.structural.pratice.proxy.exercise1;

/*
🗂️ Ex 1 — Carregamento preguiçoso de imagens

Contexto:
Um app carrega imagens pesadas que só precisam aparecer quando realmente exibidas.

Desafio:
Crie Image (interface) com display().
Implemente RealImage (carrega arquivo real) e ImageProxy (carrega sob demanda).

Vantagem:
Controle de acesso e otimização de desempenho.
 */

public class Main {
    public static void main(String[] args) {
        Image img1 = new ImageProxy("paisagem.png");
        Image img2 = new ImageProxy("avatar.jpg");

        System.out.println("\nPrimeira exibição da paisagem:");
        img1.display();

        System.out.println("\nSegunda exibição da paisagem:");
        img1.display();

        System.out.println("\nExibindo avatar:");
        img2.display();
    }
}