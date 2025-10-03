package org.example.creation.prototype;

public class MazeGame {

    public static Maze createMaze(MazeProtoTypeFactory factory) {
        Maze maze = factory.makeMaze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door theDoor = factory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        // usar sempre o factory
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
        MazeProtoTypeFactory factory = new MazeProtoTypeFactory(
                new Maze(),
                new Wall(),
                new Door(),
                new Room()
        );

        Maze maze = createMaze(factory);
        System.out.println("Maze criado via Prototype com sucesso!");
    }
}
