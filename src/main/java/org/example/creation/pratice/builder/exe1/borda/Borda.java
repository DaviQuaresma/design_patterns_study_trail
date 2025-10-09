package org.example.creation.pratice.builder.exe1.borda;

public class Borda {
    private final String tipo;

    public Borda(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
