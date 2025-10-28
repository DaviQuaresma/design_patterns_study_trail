package org.example.structural.pratice.decorator.exercise3.decorators;

import org.example.structural.pratice.decorator.exercise3.components.AudioStream;

public class BassBoostEffect extends AudioDecorator{
    public BassBoostEffect(AudioStream audioStream) {
        super(audioStream);
    }

    @Override
    public String Play(){
        return super.Play() + " + ativando BassBoostEffect";
    }
}
