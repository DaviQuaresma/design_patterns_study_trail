package org.example.creation.prototype;

public class Door extends MapSite implements Cloneable {
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    public Door() {
        this(null, null);
    }

    @Override
    public void Enter() {}

    @Override
    public Door clone() {
        try {
            return (Door) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room otherSideFrom(Room room) {
        if (room == room1)
            return room2;
        else if (room == room2)
            return room1;
        else
            return null;
    }
}
