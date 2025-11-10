package org.example.behavioral.chainOfResponsability;

public class Button extends Widget {

    public Button(Widget parent, int topic) {
        super(parent, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Exibindo ajuda específica do botão...");
        } else {
            super.handleHelp();
        }
    }
}
