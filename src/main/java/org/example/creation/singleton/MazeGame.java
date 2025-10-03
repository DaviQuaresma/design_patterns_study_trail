package org.example.creation.singleton;

public class MazeGame {

    public static Maze createMaze() {
        // Pega a única instância da MazeFactory
        MazeFactory factory = MazeFactory.getInstance();

        Maze maze = factory.makeMaze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door theDoor = factory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, factory.makeWall());
        r1.setSide(Direction.EAST, factory.makeWall());
        r1.setSide(Direction.SOUTH, theDoor);
        r1.setSide(Direction.WEST, factory.makeWall());

        r2.setSide(Direction.NORTH, theDoor);
        r2.setSide(Direction.EAST, factory.makeWall());
        r2.setSide(Direction.SOUTH, factory.makeWall());
        r2.setSide(Direction.WEST, factory.makeWall());

        return maze;
    }

    public static void main(String[] args) {
        Maze maze = createMaze();
        System.out.println("Maze criado com sucesso usando Singleton!");
    }
}
