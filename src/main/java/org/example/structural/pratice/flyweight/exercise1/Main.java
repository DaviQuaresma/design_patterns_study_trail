package org.example.structural.pratice.flyweight.exercise1;

/*
🎮 Ex 1 — Renderização de árvores

Contexto:
Um mapa tem 10.000 árvores, mas só mudam posição.

Desafio:
Crie TreeType (flyweight compartilhado) e Tree (extrínseco).
Use uma fábrica para compartilhar tipos de árvore (textura, cor, forma).

Vantagem:
Economia extrema de memória.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        forest.add(new Tree(10, 20, TreeFactory.getTreeType("Pine", "Green", "Smooth")));
        forest.add(new Tree(15, 25, TreeFactory.getTreeType("Pine", "Green", "Smooth")));
        forest.add(new Tree(50, 80, TreeFactory.getTreeType("Oak", "Brown", "Rough")));

        forest.forEach(Tree::draw);
    }
}