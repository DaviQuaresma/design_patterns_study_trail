package org.example.creation.factoryMethod;

public class MazeGame {

    public static Maze createMaze() {
        Maze maze = makeMaze();
        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, makeWall());
        r1.setSide(Direction.EAST, makeWall());
        r1.setSide(Direction.SOUTH, theDoor);
        r1.setSide(Direction.WEST, makeWall());

        r2.setSide(Direction.NORTH, theDoor);
        r2.setSide(Direction.EAST, makeWall());
        r2.setSide(Direction.SOUTH, makeWall());
        r2.setSide(Direction.WEST, makeWall());

        return maze;
    }

    private static Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    private static Room makeRoom(int n) {
        return new Room(n);
    }

    private static Wall makeWall() {
        return new Wall();
    }

    private static Maze makeMaze() {
        return new Maze();
    }

}
