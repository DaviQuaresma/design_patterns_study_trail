package org.example.creation.pratice.abstractFactory.exe1;

/*

🧩 1. Abstract Factory
💼 Ex 1 — Temas de interface no ERP

Contexto:
Seu ERP precisa mudar o tema (claro/escuro) de todos os componentes visuais — botões, inputs, cards etc.

Desafio:
Crie uma UIFactory com dois tipos concretos:

LightUIFactory → cria LightButton, LightInput, etc.

DarkUIFactory → cria DarkButton, DarkInput, etc.

Objetivo:
Instanciar um layout completo sem mudar o código do painel, apenas trocando a fábrica.

Vantagem:
Isola a criação de famílias inteiras de objetos compatíveis (sem if/else gigante).

*/

import org.example.creation.pratice.abstractFactory.exe1.buttons.Button;
import org.example.creation.pratice.abstractFactory.exe1.factories.LightUIFactory;
import org.example.creation.pratice.abstractFactory.exe1.factories.UIFactory;
import org.example.creation.pratice.abstractFactory.exe1.inputs.Input;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new LightUIFactory();

        Button button = factory.createButton();
        Input input = factory.createInput();

        button.renderer();
        input.renderer();

        System.out.println(button.click());

    }
}
