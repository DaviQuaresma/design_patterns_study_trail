package org.example.creation.pratice.builder.exe1.molho;

public class Molho {
    private final String tipo;

    public Molho(String tipo){
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
