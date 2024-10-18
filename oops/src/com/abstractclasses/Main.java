package com.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(28);
        son.career();

        daughhter daughter = new daughhter(67);
        daughter.career();
// we can call abstract constructor using super()
 // we can create constructor in abstract classes
 //but we cannot create object of abstract class without overriding

 // Parent mom = new Parent();
 // we cannot create abstract static method  but we can create static method in abstract classes
        // if  we final behind class it makes class unable to inherit
        // multiple inhertence not allowed
     Parent.hello();



    }
}
