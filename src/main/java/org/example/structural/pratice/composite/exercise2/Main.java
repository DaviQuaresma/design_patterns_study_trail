package org.example.structural.pratice.composite.exercise2;

/*
🏗️ Ex 2 — Cena gráfica

Contexto:
Um editor 2D tem objetos (Circle, Rectangle) e grupos de objetos (Group).

Desafio:
Use Composite para permitir que um Group contenha outras formas e grupos, e todos respondam a draw().

Vantagem:
Manipulação uniforme de objetos simples e compostos.
 */

public class Main {
    public static void main(String[] args) {

        // Formas simples
        Circle circle1 = new Circle("Círculo Vermelho");
        Rectangle rect1 = new Rectangle("Retângulo Azul");
        Circle circle2 = new Circle("Círculo Verde");

        // Grupos
        Group group1 = new Group("Camada Base");
        group1.add(circle1);
        group1.add(rect1);

        Group group2 = new Group("Camada Superior");
        group2.add(circle2);
        group2.add(group1); // <-- grupo dentro de outro grupo!

        // Desenhar tudo
        System.out.println("🖌️ Desenhando cena completa:");
        group2.draw();
    }
}

/*
💬 Como funciona a conexão

Tanto Circle, Rectangle quanto Group implementam a mesma interface (Graphic);
Isso significa que você pode colocar um Group dentro de outro Group, porque ele é tratado como qualquer Graphic;
O método draw() é recursivo: cada grupo chama draw() de seus filhos, que podem ser outros grupos ou formas;
É essa recursividade que permite composições infinitas (sem precisar criar mil subclasses).

🧠 Analogia

Imagine o Microsoft Paint:
Cada forma desenhada (Circle, Rectangle) é um objeto gráfico simples;
Quando você agrupa várias formas, cria um Group;
E pode agrupar grupos (como "Camada 1" e "Camada 2").
O Composite permite manipular tudo com a mesma interface, seja 1 forma ou 100 grupos.
 */