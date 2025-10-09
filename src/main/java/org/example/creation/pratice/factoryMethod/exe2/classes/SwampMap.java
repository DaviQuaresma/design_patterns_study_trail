package org.example.creation.pratice.factoryMethod.exe2.classes;

import org.example.creation.pratice.factoryMethod.exe2.interfaces.Enemy;
import org.example.creation.pratice.factoryMethod.exe2.interfaces.Springan;

public class SwampMap extends GameMap {
    @Override
    public Enemy spawnEnemy() {
        return new Springan();
    }
}
