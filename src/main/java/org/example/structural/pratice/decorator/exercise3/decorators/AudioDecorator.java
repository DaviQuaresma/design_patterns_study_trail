package org.example.structural.pratice.decorator.exercise3.decorators;

import org.example.structural.pratice.decorator.exercise3.components.AudioStream;

public class AudioDecorator implements AudioStream {
    private AudioStream audioStream;

    public AudioDecorator(AudioStream audioStream) {
        this.audioStream = audioStream;
    }

    @Override
    public String Play() {
        return audioStream.Play();
    }
}
