package org.example.structural.pratice.composite.exercise1;

//A folha não tem filhos, então add e remove não são suportados.

public class MenuItem implements MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("Item de menu não pode conter subitens.");
    }

    @Override
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("Item de menu não pode conter subitens.");
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "📄 Item: " + name);
    }
}
