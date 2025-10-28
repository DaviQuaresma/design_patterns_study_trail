package org.example.structural.pratice.adapter.exercise2;

/*
🎮 Ex 2 — Controle de jogo multiplataforma

Contexto:
Um jogo usa uma interface GameController (com moveLeft(), jump()...), mas há controladores antigos (OldJoystickAPI) com nomes diferentes de métodos.

Desafio:
Crie um JoystickAdapter que implemente GameController e converta as chamadas pro joystick antigo.

Vantagem:
Reutiliza código legado com uma interface moderna.
 */

public class Main {
    public static void main(String[] args) {
        ControllerProcessor processor = new JoystickAdapter("Davi");
        processor.jump();
        processor.crunch();
        processor.moveRight();
        processor.moveLeft();
        processor.moveForward();
        processor.moveBackward();
    }
}
