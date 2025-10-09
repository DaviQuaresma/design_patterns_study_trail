package org.example.creation.pratice.factoryMethod.exe2.classes;

import org.example.creation.pratice.factoryMethod.exe2.interfaces.Enemy;

public abstract class GameMap {

    public abstract Enemy spawnEnemy();

    public Enemy spawnNewEnemy(){
        Enemy enemy = spawnEnemy();
        enemy.spawn();
        return enemy;
    }

}
