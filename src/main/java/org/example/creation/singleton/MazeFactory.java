package org.example.creation.singleton;

public class MazeFactory {
    // instância única estática
    private static MazeFactory instance;

    // construtor privado (ninguém fora pode instanciar)
    private MazeFactory() {}

    // ponto de acesso global
    public static MazeFactory getInstance() {
        if (instance == null) {
            instance = new MazeFactory();
        }
        return instance;
    }

    // Métodos fábrica
    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public Room makeRoom() {
        return new Room();
    }
}
