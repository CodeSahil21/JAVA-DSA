package com.Interfaces;



public class PowerEngine implements Engine{


    @Override
    public void start() {
        System.out.println("Power Engine Start" );
    }

    @Override
    public void stop() {
        System.out.println("power Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine accelerate");
    }
}
