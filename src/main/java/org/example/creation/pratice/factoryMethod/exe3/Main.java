package org.example.creation.pratice.factoryMethod.exe3;

import org.example.creation.pratice.factoryMethod.exe3.classes.NFCe;

/*
⚙️ Exercício 1 — Emissão de documentos fiscais (ERP)
🎯 Contexto

Você está desenvolvendo um módulo de emissão de documentos fiscais no ERP.
Existem três tipos de documento:

NFCe (consumidor final),
NFe (nota eletrônica padrão),
CTe (transporte).

Cada tipo precisa ser criado de forma diferente, mas a lógica de emissão geral é a mesma: validar → gerar XML → transmitir.
 */

public class Main {
    public static void main(String[] args) {
        new NFCe().transmit();
    }
}
