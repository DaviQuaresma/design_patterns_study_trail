package org.example.structural.pratice.decorator.exercise1;

/*
🧾 Ex 1 — Campos de formulário com comportamento extra

Contexto:
Campos de input precisam ganhar recursos sem herança — como Validação, Criptografia, AutoComplete.

Desafio:
Implemente InputField base e decoradores como ValidatingInput, EncryptedInput.

Vantagem:
Adiciona responsabilidades dinamicamente sem alterar o código base.
 */

import org.example.structural.pratice.decorator.exercise1.components.InputField;
import org.example.structural.pratice.decorator.exercise1.components.VisualComponent;
import org.example.structural.pratice.decorator.exercise1.decorators.EncryptedInput;
import org.example.structural.pratice.decorator.exercise1.decorators.ValidatingInput;

public class Main {
    public static void main(String[] args) {
        VisualComponent base = new InputField();

        System.out.println("\n🧱 InputField simples:");
        base.draw();

        System.out.println("\n🔒 InputField com criptografia:");
        VisualComponent encrypted = new EncryptedInput(base, 5);
        encrypted.draw();

        System.out.println("\n✅ InputField com validação e criptografia:");
        VisualComponent validatedAndEncrypted = new ValidatingInput(
                new EncryptedInput(base, 5), 10
        );
        validatedAndEncrypted.draw();
    }
}

