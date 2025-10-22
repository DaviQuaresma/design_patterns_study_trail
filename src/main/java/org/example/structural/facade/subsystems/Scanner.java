package org.example.structural.facade.subsystems;

import java.io.InputStream;

public class Scanner {
    private InputStream inputStream;

    public Scanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Token scan() {
        System.out.println("📖 Lendo tokens do stream...");
        return new Token("TOKEN_EXEMPLO");
    }
}
