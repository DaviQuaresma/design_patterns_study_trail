package org.example.creation.factoryMethod;

public class Room extends MapSite {
    private MapSite[] sides = new MapSite[4];
    private int roomNumber;

    public Room(int n) {
    }

    public MapSite getSide(Direction direction) {
        return sides[direction.ordinal()];
    }

    public void setSide(Direction direction, MapSite site) {
        sides[direction.ordinal()] = site;
    }

    @Override
    public void Enter() {
        System.out.println("You entered room " + roomNumber);
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
