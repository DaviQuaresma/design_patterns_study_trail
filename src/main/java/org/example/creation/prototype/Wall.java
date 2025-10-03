package org.example.creation.prototype;

public class Wall extends MapSite implements Cloneable {

    public Wall() {}

    @Override
    public void Enter() {}

    @Override
    public Wall clone(){
        try {
            return (Wall) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
