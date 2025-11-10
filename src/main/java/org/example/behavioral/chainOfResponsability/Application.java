package org.example.behavioral.chainOfResponsability;

public class Application extends HelpHandler {

    public Application(int topic) {
        super(null, topic);
    }

    @Override
    public void handleHelp() {
        System.out.println("Exibindo a lista completa de tópicos de ajuda da aplicação...");
    }
}
