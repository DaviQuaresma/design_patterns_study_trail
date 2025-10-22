package org.example.structural.facade;

import org.example.structural.facade.subsystems.BytecodeStream;
import org.example.structural.facade.facade.Compiler;

import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        String code = "int x = 10;";
        ByteArrayInputStream input = new ByteArrayInputStream(code.getBytes());
        BytecodeStream output = new BytecodeStream();

        Compiler compiler = new Compiler();
        compiler.compile(input, output);
    }
}
