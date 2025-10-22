package org.example.structural.facade.subsystems;

public class RISCCodeGenerator extends CodeGenerator {

    public RISCCodeGenerator(BytecodeStream output) {
        super(output);
    }

    @Override
    public void visit(ProgramNode node) {
        System.out.println("⚙️ Gerando código RISC para: " + node.getName());
        output.write("Instrução para " + node.getName());
    }
}
