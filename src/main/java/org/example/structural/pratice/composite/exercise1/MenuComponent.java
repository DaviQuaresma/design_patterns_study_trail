package org.example.structural.pratice.composite.exercise1;

/*
Cada componente pode:

adicionar/remover filhos (no caso de Menu);

exibir a si mesmo (display).

O parâmetro indent serve pra formatar visualmente a hierarquia.
 */

public interface MenuComponent {
    void add(MenuComponent component);
    void remove(MenuComponent component);
    void display(int indent);
}
