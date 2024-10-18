package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square  square = new Square();

        circle .area();
       square .area();
        shape .area();
        //types of polymorphism
        /*
        1) compile time plymorphism or static polymorphism : achieved via method overloading
        methods(Same name but types,arguments,return types ordering can be different ex multiple constructor)
         2) Run time or dynamic polymorphism : achieved by overriding
         // parent obj = new child();
         hence method will be called depends on child this is known as upcasting
         // java detemines which method to be run is through dynamic method dispatch : it determines at run time
         // which depends on types of obj
         */
    }
}
