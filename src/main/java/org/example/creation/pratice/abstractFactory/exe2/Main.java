package org.example.creation.pratice.abstractFactory.exe2;


/*

⚔️ Ex 2 — Fábrica de raças em um RPG

Contexto:
Um jogo cria personagens de raças diferentes: Elfo, Anão, Humano.
Cada raça tem armas e montarias próprias.

Desafio:
Implemente uma RaceFactory (abstrata) com métodos createWeapon() e createMount().
Depois implemente ElfFactory, DwarfFactory e HumanFactory.

Objetivo:
Gerar personagens completos apenas escolhendo a fábrica.

Vantagem:
Cria famílias de objetos compatíveis sem acoplamento entre classes de raças e suas armas.

 */

import org.example.creation.pratice.abstractFactory.exe2.factories.HumanFactory;
import org.example.creation.pratice.abstractFactory.exe2.factories.RaceFactory;
import org.example.creation.pratice.abstractFactory.exe2.mounts.HumanMount;
import org.example.creation.pratice.abstractFactory.exe2.mounts.MountFactory;
import org.example.creation.pratice.abstractFactory.exe2.weapons.HumanWeapon;
import org.example.creation.pratice.abstractFactory.exe2.weapons.WeaponFactory;

public class Main {
    public static void main(String[] args) {
        RaceFactory race = new HumanFactory();
        WeaponFactory weapon = new HumanWeapon();
        MountFactory mount = new HumanMount();

        System.out.println(race.Greatings());

        weapon.createWeapon();
        System.out.println(weapon.wieldWeapon());

        mount.createMount();
        System.out.println(mount.mount());
    }
}
