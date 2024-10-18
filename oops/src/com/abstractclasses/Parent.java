package com.abstractclasses;

public abstract class Parent {

    int age;
    public Parent(int age){
        this.age=age;
    }

    static void hello(){
        System.out.println("hey");
    }
    abstract void career();
   // abstract void career(String name);
   // abstract void partner(String name,int age);
    abstract void partner();
    // A parent class must also be abstract if it has abstract classes
     
}
