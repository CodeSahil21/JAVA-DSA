package com.inheritance;

public class Boxweight  extends Box{//inhertance using extends keyword
    double weight;
    public Boxweight(){
        this.weight = -1;
    }
  // it will not   @override
    static void greeting(){
        System.out.println("Hey,I am in Box.Greetings");
    }

    Boxweight(Boxweight other){
        super(other);
        weight = other.weight;
    }

    public Boxweight(double l,double h, double w,double weight){
      //  System.out.println("");
        super(l,h,w);// super : use this keyword to call the parent class constructor
        // private variable can only be used in its own file
      //  this.l = l;
       // this.h = h;
       // this.w = w;
        this.weight = weight;
        //System.out.println(super.w); if you want weight in box class

    }

}
