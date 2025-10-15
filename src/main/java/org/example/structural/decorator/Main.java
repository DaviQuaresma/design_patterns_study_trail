package org.example.structural.decorator;

import org.example.structural.decorator.components.TextView;
import org.example.structural.decorator.components.VisualComponent;
import org.example.structural.decorator.decorators.BorderDecorator;
import org.example.structural.decorator.decorators.ScrollDecorator;

public class Main {
    public static void main(String[] args) {
        // TextView simples
        VisualComponent textView = new TextView();

        System.out.println("=== TextView simples ===");
        textView.draw();

        // TextView com Scroll
        System.out.println("\n=== TextView com Scroll ===");
        VisualComponent scrollTextView = new ScrollDecorator(textView);
        scrollTextView.draw();

        // TextView com Scroll e Borda
        System.out.println("\n=== TextView com Scroll + Borda ===");
        VisualComponent borderedScrollTextView = new BorderDecorator(
                new ScrollDecorator(textView),
                2
        );
        borderedScrollTextView.draw();
    }
}
