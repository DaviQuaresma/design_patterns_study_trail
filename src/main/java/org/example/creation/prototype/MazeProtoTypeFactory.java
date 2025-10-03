package org.example.creation.prototype;

public class MazeProtoTypeFactory {
    private Maze _prototypeMaze;
    private Wall _prototypeWall;
    private Door _prototypeDoor;
    private Room _prototypeRoom;

    public MazeProtoTypeFactory(Maze makeMaze, Wall makeWall, Door makeDoor, Room makeRoom) {
        this._prototypeMaze = makeMaze;
        this._prototypeWall = makeWall;
        this._prototypeDoor = makeDoor;
        this._prototypeRoom = makeRoom;
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return _prototypeWall.clone();
    }

    public Door makeDoor(Room r1, Room r2) {
        Door  door = _prototypeDoor.clone();
        door.initialize(r1, r2);
        return door;
    }

    public Room makeRoom() {
        return new Room();
    }

}
