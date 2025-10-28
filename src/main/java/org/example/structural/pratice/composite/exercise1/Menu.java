package org.example.structural.pratice.composite.exercise1;

import java.util.ArrayList;
import java.util.List;

/*
Aqui, Menu:

guarda uma lista de MenuComponent (pode ser Menu ou MenuItem);

exibe todos os filhos recursivamente.
 */

public class Menu implements MenuComponent {
    private String name;
    private final List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "📂 Menu: " + name);
        for (MenuComponent c : components) {
            c.display(indent + 2);
        }
    }
}
