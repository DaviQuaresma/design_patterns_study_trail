package org.example.creation.builder;

public abstract class MazeBuilder {

    public void buildMaze() {
        // implementação vazia (opcional para subclasses)
    }

    public void buildRoom(int room) {
        // implementação vazia
    }

    public void buildDoor(int roomFrom, int roomTo) {
        // implementação vazia
    }

    public Maze getMaze() {
        return null;
    }

    protected MazeBuilder() {
    }
}
