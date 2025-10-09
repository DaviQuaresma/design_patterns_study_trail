package org.example.structural.adapter;


public class Main {
    public static void main(String[] args) {
        TextView textView = new TextView();
        Shape textShape = new TextShape(textView);

        Point bl = new Point();
        Point tr = new Point();

        textShape.boundingBox(bl, tr);

        System.out.println("BottomLeft: (" + bl.getX() + ", " + bl.getY() + ")");
        System.out.println("TopRight: (" + tr.getX() + ", " + tr.getY() + ")");
        System.out.println("Está vazio? " + textShape.isEmpty());
    }
}
