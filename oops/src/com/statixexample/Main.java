package com.statixexample;

public class Main {
    public static void main(String[] args) {
        human Chris = new human(29,"CHRIS EVANS",200000, false);
                // if the files are in same folder we don't have to use import statement
        human liam = new human(23,"LIAM EVANS",20000, true);
        System.out.println(Chris.age);
        System.out.println(Chris.name);
        System.out.println(Chris.salary);
        System.out.println(Chris.married);
        System.out.println(human.population);
        System.out.println();
        System.out.println(liam.age);
        System.out.println(liam.name);
        System.out.println(liam.salary);
        System.out.println(liam.married);
        System.out.println(human.population);
        // when ever we acess static variable use class name instead of reference variable even though it still works
        // but still proper convention will be using class name
        // static variable : when a member is declared static it can be accessed before any of the object of class is created
        // and without referencing to the object
        // greeting();
        // inside a static method you cannot use anything that is not static ie static data can only access static data only
        Main funn = new Main();
        funn.fun2();
    }
    static  void fun(){
     //   greeting();// you cannot use this because it requires instance //but function you are using in it does not depend on instance
        //  but we can accees this using this  way
        // you cannot accees non static without referencing their instances in static a content
        Main obj = new Main();
        obj.greeting();

        // inside a static method you cannot use anything that is not static ie static data can only access static data only

    }
    void fun2(){
        greeting();
    }
// we know that something which is not static belongs to object
    void greeting(){
        fun();
        System.out.println("Hello World!");
    }
}
