package org.example.structural.pratice.bridge.exercise3;

/*
🎮 Ex 3: Halo Combat Evolved — Armas e Tipos de Munição

Contexto:

No universo de Halo, cada arma pode usar tipos diferentes de munição — por exemplo:

O Rifle de Assalto pode usar balas cinéticas (tradicionais).

O Plasma Rifle usa plasma energético.

O Needler usa agulhas explosivas.

Com o Bridge, conseguimos representar essas combinações sem precisar criar classes como PlasmaRifleNeedler, RifleDeAssaltoPlasma, etc.

 */

import org.example.structural.pratice.bridge.exercise3.implementations.CineticAmmo;
import org.example.structural.pratice.bridge.exercise3.implementations.PlasmaAmmo;
import org.example.structural.pratice.bridge.exercise3.implementations.NeedleAmmo;
import org.example.structural.pratice.bridge.exercise3.subClasses.AssaultRifle;
import org.example.structural.pratice.bridge.exercise3.subClasses.Needler;
import org.example.structural.pratice.bridge.exercise3.subClasses.PlasmaRifle;

public class Main {
    public static void main(String[] args) {
        Weapon rifleKinetic = new AssaultRifle(new CineticAmmo());
        Weapon plasmaPlasma = new PlasmaRifle(new PlasmaAmmo());
        Weapon needlerNeedle = new Needler(new NeedleAmmo());
        Weapon riflePlasma = new AssaultRifle(new PlasmaAmmo()); // combinação inusitada!

        rifleKinetic.shoot();
        plasmaPlasma.shoot();
        needlerNeedle.shoot();
        riflePlasma.shoot();
    }
}

/*

💬 O que aprendemos com o exemplo

Weapon é a abstração (tipo de arma).

AmmoType é a implementação (tipo de munição).

A ponte (Weapon → AmmoType) permite criar combinações dinâmicas.

Se amanhã quisermos adicionar EnergySword ou ExplosiveAmmo, não precisamos tocar nas classes existentes.

 */