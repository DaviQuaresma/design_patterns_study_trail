package org.example.structural.facade.subsystems;

public abstract class CodeGenerator {
    protected BytecodeStream output;

    public CodeGenerator(BytecodeStream output) {
        this.output = output;
    }

    public abstract void visit(ProgramNode node);
}
