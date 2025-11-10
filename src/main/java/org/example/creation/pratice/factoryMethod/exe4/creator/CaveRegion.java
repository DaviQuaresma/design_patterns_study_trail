package org.example.creation.pratice.factoryMethod.exe4.creator;

import org.example.creation.pratice.factoryMethod.exe4.product.Enemy;
import org.example.creation.pratice.factoryMethod.exe4.product.Goblin;

public class CaveRegion extends Region{
    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}
