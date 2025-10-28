package org.example.structural.pratice.adapter.exercise2;

public class JoystickAdapter implements ControllerProcessor {
    private final OldJoystickAPI oldJoystick;

    public JoystickAdapter(String player) {
        this.oldJoystick = new OldJoystickAPI(player);
    }

    @Override
    public void moveLeft() {
        oldJoystick.turnLeft();
    }

    @Override
    public void moveRight() {
        oldJoystick.turnRight();
    }

    @Override
    public void moveForward() {
        oldJoystick.goForward();
    }

    @Override
    public void moveBackward() {
        oldJoystick.goBack();
    }

    @Override
    public void jump() {
        oldJoystick.buttonA();
    }

    @Override
    public void crunch() {
        oldJoystick.buttonB();
    }
}

