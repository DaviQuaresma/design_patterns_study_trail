package org.example.behavioral.chainOfResponsability;

public class Widget extends HelpHandler {
    private Widget parent;

    public Widget(Widget parent, int topic) {
        super(parent, topic);
        this.parent = parent;
    }

    public Widget getParent() {
        return parent;
    }
}
