package org.example.structural.pratice.decorator.exercise3.decorators;

import org.example.structural.pratice.decorator.exercise3.components.AudioStream;

public class EchoEffect extends AudioDecorator{
    public EchoEffect(AudioStream audioStream) {
        super(audioStream);
    }

    @Override
    public String Play(){
        return super.Play() + " + ativando EchoEffect";
    }
}
