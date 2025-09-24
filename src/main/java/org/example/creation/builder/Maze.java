package org.example.creation.builder;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<>();

    public Maze() {
    }

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public Room roomNo(int number) {
        return rooms.get(number);
    }
}
