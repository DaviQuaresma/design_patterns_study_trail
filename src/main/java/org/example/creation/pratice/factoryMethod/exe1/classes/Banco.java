package org.example.creation.pratice.factoryMethod.exe1.classes;

import org.example.creation.pratice.factoryMethod.exe1.interfaces.Conta;

public abstract class Banco {

    // Metodo Fabrica
    public abstract Conta criarConta(String type);

    // Metodo de alto nivel que usa o factory
    public Conta abrirNovaConta(String type) {
        Conta conta = criarConta(type); // chama o metodo que a subclasse implementa
        conta.openCount();
        return conta;
    }
}
