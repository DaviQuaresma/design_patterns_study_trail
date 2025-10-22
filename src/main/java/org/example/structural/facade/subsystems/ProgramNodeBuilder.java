package org.example.structural.facade.subsystems;

public class ProgramNodeBuilder {
    private ProgramNode rootNode;

    public ProgramNodeBuilder() {
        rootNode = new ProgramNode("Root");
    }

    public void newVariable(String name) {
        rootNode.add(new ProgramNode("Variável: " + name));
    }

    public void newAssignment(String variable, String expression) {
        rootNode.add(new ProgramNode("Atribuição: " + variable + " = " + expression));
    }

    public ProgramNode getRootNode() {
        return rootNode;
    }
}
