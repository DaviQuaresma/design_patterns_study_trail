package org.example.behavioral.chainOfResponsability;

public class Dialog extends Widget {

    public Dialog(HelpHandler handler, int topic) {
        super(null, topic);
        setHandler(handler, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Exibindo ajuda da janela de diálogo...");
        } else {
            super.handleHelp();
        }
    }
}
