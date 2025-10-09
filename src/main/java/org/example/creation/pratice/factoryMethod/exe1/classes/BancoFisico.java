package org.example.creation.pratice.factoryMethod.exe1.classes;

import org.example.creation.pratice.factoryMethod.exe1.interfaces.Conta;
import org.example.creation.pratice.factoryMethod.exe1.interfaces.ContaCorrente;
import org.example.creation.pratice.factoryMethod.exe1.interfaces.ContaPoupanca;

public class BancoFisico extends Banco{

    @Override
    public Conta criarConta(String type) {
        return switch (type.toLowerCase()) {
            case "corrente" -> new ContaCorrente();
            case "poupanca" -> new ContaPoupanca();
            default -> throw new IllegalArgumentException("Tipo de conta não suportado no banco fisico: " + type);
        };
    }
}
