package org.example.creation.pratice.builder.exe1.recheio;

public class Recheio {
    private final String tipo;

    public Recheio(String tipo){
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
