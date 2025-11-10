package org.example.behavioral.chainOfResponsability;

public class Main {
    public static final int PRINT_TOPIC = 1;
    public static final int PAPER_ORIENTATION_TOPIC = 2;
    public static final int APPLICATION_TOPIC = 3;

    public static void main(String[] args) {
        Application application = new Application(APPLICATION_TOPIC);
        Dialog dialog = new Dialog(application, PRINT_TOPIC);
        Button button = new Button(dialog, PAPER_ORIENTATION_TOPIC);

        // Solicitação parte do botão
        button.handleHelp();
    }
}
