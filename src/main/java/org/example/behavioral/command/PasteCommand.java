package org.example.behavioral.command;

import org.example.behavioral.command.helpers.Document;

public class PasteCommand implements Command {
    private final Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }
}
