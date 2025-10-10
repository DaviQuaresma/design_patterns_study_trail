package org.example.creation.pratice.abstractFactory.exe1.buttons;

public class DarkButton implements Button{
    @Override
    public void renderer(){
        System.out.println("DarkButton.renderer");
    }

    @Override
    public String click(){
        return "DarkButton.click";
    }
}
