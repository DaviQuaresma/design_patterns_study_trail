package org.example.creation.pratice.factoryMethod.exe4.creator;

import org.example.creation.pratice.factoryMethod.exe4.product.Enemy;
import org.example.creation.pratice.factoryMethod.exe4.product.Orc;

public class DesertRegion extends Region{
    @Override
    public Enemy createEnemy() {
        return new Orc();
    }
}
