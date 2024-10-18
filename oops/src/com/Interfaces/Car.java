package com.Interfaces;

public class Car implements Engine, Brake,Media{


    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I Start Engine like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop Engine like a normal car");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");

    }
}
