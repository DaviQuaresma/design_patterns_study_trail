package org.example.behavioral.command;

import org.example.behavioral.command.helpers.Application;
import org.example.behavioral.command.helpers.Document;

public class OpenCommand implements Command {
    private final Application application;
    private String response;

    public OpenCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        String name = askUser();
        if (name != null && !name.isEmpty()) {
            Document document = new Document(name);
            application.add(document);
            document.open();
        }
    }

    protected String askUser() {
        // Simula entrada do usuário
        return "novo_documento.txt";
    }
}
