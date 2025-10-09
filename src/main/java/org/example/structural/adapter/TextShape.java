package org.example.structural.adapter;

public class TextShape extends Shape {
    private TextView text; // referência para o objeto legado

    public TextShape(TextView text) {
        this.text = text;
    }

    @Override
    public void boundingBox(Point bottomLeft, Point topRight) {
        Point origin = new Point();
        Point extent = new Point();

        text.getOrigin(origin);
        text.getExtent(extent);

        int bottom = origin.getY();
        int left = origin.getX();
        int width = extent.getX();
        int height = extent.getY();

        bottomLeft.setX(bottom);
        bottomLeft.setY(left);
        topRight.setX(bottom + height);
        topRight.setY(left + width);
    }

    @Override
    public boolean isEmpty() {
        return text.isEmpty();
    }

    @Override
    public TextManipulator createManipulator() {
        return new TextManipulator(this);
    }
}
