package org.example.structural.pratice.decorator.exercise3.decorators;

import org.example.structural.pratice.decorator.exercise3.components.AudioStream;

public class ReverbEffect extends AudioDecorator{
    public ReverbEffect(AudioStream audioStream) {
        super(audioStream);
    }

    @Override
    public String Play(){
        return super.Play() + " + ativando ReverbEffect";
    }
}
