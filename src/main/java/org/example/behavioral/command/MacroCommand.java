package org.example.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command c) {
        commands.add(c);
    }

    public void remove(Command c) {
        commands.remove(c);
    }

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }
}
