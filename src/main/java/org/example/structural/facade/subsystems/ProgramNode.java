package org.example.structural.facade.subsystems;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode {
    private String name;
    private List<ProgramNode> children = new ArrayList<>();

    public ProgramNode(String name) {
        this.name = name;
    }

    public void add(ProgramNode node) {
        children.add(node);
    }

    public void traverse(CodeGenerator generator) {
        generator.visit(this);
        for (ProgramNode child : children) {
            child.traverse(generator);
        }
    }

    public String getName() {
        return name;
    }
}
