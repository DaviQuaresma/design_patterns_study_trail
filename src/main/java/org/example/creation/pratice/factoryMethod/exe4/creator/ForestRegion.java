package org.example.creation.pratice.factoryMethod.exe4.creator;

import org.example.creation.pratice.factoryMethod.exe4.product.Elf;
import org.example.creation.pratice.factoryMethod.exe4.product.Enemy;

public class ForestRegion extends Region{
    @Override
    public Enemy createEnemy() {
        return new Elf();
    }
}
