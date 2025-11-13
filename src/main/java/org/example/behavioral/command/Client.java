package org.example.behavioral.command;

import org.example.behavioral.command.helpers.Application;
import org.example.behavioral.command.helpers.Document;

/*

Explicação

Command Pattern encapsula uma ação em um objeto, permitindo que comandos sejam armazenados, enfileirados, desfeitos ou combinados.

Vantagens:

-Desacopla quem solicita uma ação de quem a executa.
-Permite compor comandos complexos (como MacroCommand).
-Facilita undo/redo, histórico de ações e automações.

 */

public class Client {
    public static void main(String[] args) {
        Application app = new Application();
        Document doc = new Document("relatorio.txt");

        Command open = new OpenCommand(app);
        Command paste = new PasteCommand(doc);

        MacroCommand macro = new MacroCommand();
        macro.add(open);
        macro.add(paste);

        System.out.println("Executando macro de comandos:");
        macro.execute();
    }
}
