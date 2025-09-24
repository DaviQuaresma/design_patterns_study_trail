package org.example.creation.builder;

public class MazeGame {

    public static Maze createMaze(MazeBuilder mazeBuilder) {

        mazeBuilder.buildMaze();
        mazeBuilder.buildRoom(1);
        mazeBuilder.buildRoom(2);
        mazeBuilder.buildDoor(1,2);

        return mazeBuilder.getMaze();
    }

    // Se quiser rodar o programa
    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        MazeBuilder builder = new StandardMazeBuilder();

        Maze maze = game.createMaze(builder);

        System.out.println("Maze criado com sucesso!");
    }
}
