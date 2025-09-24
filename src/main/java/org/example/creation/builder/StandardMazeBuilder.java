package org.example.creation.builder;

public class StandardMazeBuilder extends MazeBuilder {
    private Maze currentMaze;

    public StandardMazeBuilder() {
        this.currentMaze = null;
    }

    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNumber) {
        if (currentMaze.roomNo(roomNumber) == null) {
            Room room = new Room(roomNumber);
            currentMaze.addRoom(room);

            // Inicializa os 4 lados como paredes
            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room r1 = currentMaze.roomNo(roomFrom);
        Room r2 = currentMaze.roomNo(roomTo);

        if (r1 != null && r2 != null) {
            Door d = new Door(r1, r2);

            // Para simplificar, conectamos r1 EAST <-> r2 WEST
            r1.setSide(Direction.EAST, d);
            r2.setSide(Direction.WEST, d);
        }
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    // Implementação simplificada de "CommonWall"
    private Direction commonWall(Room r1, Room r2) {
        // No exemplo GoF ele decide qual parede compartilhar,
        // aqui você pode implementar sua lógica de acordo com as regras
        return Direction.EAST; // placeholder
    }
}
