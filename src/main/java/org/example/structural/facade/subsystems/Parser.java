package org.example.structural.facade.subsystems;

public class Parser {
    public void parse(Scanner scanner, ProgramNodeBuilder builder) {
        System.out.println("🔍 Interpretando tokens e construindo árvore de sintaxe...");
        builder.newVariable("x");
        builder.newAssignment("x", "10");
    }
}
