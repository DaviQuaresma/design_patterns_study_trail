package org.example.creation.pratice.builder.exe1.massa;

public class Massa {
    private final String tipo;

    public Massa(String tipo){
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
