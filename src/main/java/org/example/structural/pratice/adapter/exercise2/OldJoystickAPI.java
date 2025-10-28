package org.example.structural.pratice.adapter.exercise2;

public class OldJoystickAPI {
    String player;

    public OldJoystickAPI(String player) {
        this.player = player;
    }

    public void turnLeft() {
        System.out.println(player + " está virando à esquerda.");
    }

    public void turnRight() {
        System.out.println(player + " está virando à direita.");
    }

    public void goForward() {
        System.out.println(player + " está indo pra frente.");
    }

    public void goBack() {
        System.out.println(player + " está recuando.");
    }

    public void buttonA() {
        System.out.println(player + " pulou (botão A).");
    }

    public void buttonB() {
        System.out.println(player + " agachou (botão B).");
    }
}

