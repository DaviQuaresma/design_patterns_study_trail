package org.example.structural.pratice.decorator.exercise3.concrete;

import org.example.structural.pratice.decorator.exercise3.components.AudioStream;

public class BasicAudioStream implements AudioStream {
    @Override
    public String Play() {
        return "Tocando musica";
    }
}
