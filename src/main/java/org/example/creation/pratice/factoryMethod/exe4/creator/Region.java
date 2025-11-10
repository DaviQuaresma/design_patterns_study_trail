package org.example.creation.pratice.factoryMethod.exe4.creator;

import org.example.creation.pratice.factoryMethod.exe4.product.Enemy;

public abstract class Region {
    public void spawnEnemy(){
        Enemy e = createEnemy();
        System.out.println("Enimigo apareceu!");
        e.attack();
    }

    public abstract Enemy createEnemy();
}
