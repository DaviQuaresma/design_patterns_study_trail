package org.example.structural.facade.facade;

import org.example.structural.facade.subsystems.*;

import java.io.InputStream;

public class Compiler {
    public void compile(InputStream input, BytecodeStream output) {
        Scanner scanner = new Scanner(input);
        ProgramNodeBuilder builder = new ProgramNodeBuilder();
        Parser parser = new Parser();

        parser.parse(scanner, builder);

        RISCCodeGenerator generator = new RISCCodeGenerator(output);
        ProgramNode parseTree = builder.getRootNode();
        parseTree.traverse(generator);
    }
}
