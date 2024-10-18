package com.inheritance;

public class Box {
     //inheritance : first principle of oops
    // A class derived from base class is known as child class
    // child class which has its own variable or properties can also inherit variables (properties) from base class
    // we can incorporate both class using extend keyword

    // initialise  base class variables
   private double l;
    double h;
    double w;
    static void getL(){
        return;

    }

    //static method: can we rewrite static method
    static void greeting(){
        System.out.println("Hey,I am in Box.Greetings");
    }

    //create constructor
    Box(){
        this.l = -1;
        this.h =-1;
        this.w = -1;
    }
//cube
    Box(double side){
        //super(); object class
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
