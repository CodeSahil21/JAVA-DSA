package com.polymorphism;

public class Circle  extends  Shapes{


    @Override
    void area(){
        // this will run when obj of circle is created
        // hence it will be overiding parent method
       // @Override; this anotation for overriding
        System.out.println("Area is pie * r * r");
    }
}
