package org.example.creation.prototype;

public class Room extends MapSite implements Cloneable {
    private MapSite[] sides = new MapSite[4];
    private int roomNumber;

    public Room() {
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

    @Override
    public Room clone(){
        try {
            return (Room) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
