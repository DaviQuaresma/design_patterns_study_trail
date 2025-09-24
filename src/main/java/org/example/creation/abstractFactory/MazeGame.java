package org.example.creation.abstractFactory;

public class MazeGame {

    public static Maze createMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.makeMaze();
        Room r1 = mazeFactory.makeRoom();
        Room r2 = mazeFactory.makeRoom();
        Door theDoor = mazeFactory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, new Wall());
        r1.setSide(Direction.EAST, new Wall());
        r1.setSide(Direction.SOUTH, theDoor);
        r1.setSide(Direction.WEST, new Wall());

        r2.setSide(Direction.NORTH, theDoor);
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, new Wall());
        r2.setSide(Direction.WEST, new Wall());

        return maze;
    }

    // Se quiser rodar o programa
    /*public static void main(String[] args) {
        Maze maze = createMaze();
        System.out.println("Maze criado com sucesso!");
    }
     */
}
