package org.example.structural.adapter;

public abstract class Shape {
    public abstract void boundingBox(Point bottomLeft, Point topRight);
    public abstract boolean isEmpty();
    public abstract Manipulator createManipulator();
}