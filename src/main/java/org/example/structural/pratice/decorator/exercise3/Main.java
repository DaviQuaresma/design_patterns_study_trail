package org.example.structural.pratice.decorator.exercise3;

/*
🎧 Ex 3 — Sistema de áudio com efeitos

Contexto:
Um player de áudio precisa aplicar efeitos sonoros adicionais às faixas — como Eco, Bass Boost, e Reverb — sem modificar a classe base do player.

Desafio:
Implemente a interface AudioStream com o método play().
Crie a classe base BasicAudioStream e os decoradores EchoEffect, BassBoostEffect e ReverbEffect.
Cada decorador deve adicionar um comportamento ou mensagem adicional ao tocar o áudio.

Vantagem:
Permite aplicar múltiplos efeitos sonoros dinamicamente, combinando-os em tempo de execução.
 */

import org.example.structural.pratice.decorator.exercise3.components.AudioStream;
import org.example.structural.pratice.decorator.exercise3.concrete.BasicAudioStream;
import org.example.structural.pratice.decorator.exercise3.decorators.BassBoostEffect;

public class Main {
    public static void main(String[] args) {
        AudioStream basic = new BasicAudioStream();
        System.out.println(basic.Play());

        AudioStream bass = new BassBoostEffect(basic);
        System.out.println(bass.Play());

    }
}
