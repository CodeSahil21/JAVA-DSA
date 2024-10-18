package com.recursion.intro;



public class message {
    public static void main(String[] args) {
        // write a function, that prints hello world
        message();
    }
    static  void message(){
        System.out.println("Hello World");
        message1();
        // what if question asks to print hello world 5 times
        /*
        we cannot modify function ie writing 5 times  System.out.println("Hello World");
        we can  do something creating new function but we still need to call function only one time so this also not needed
         // we can create new function for sout(); and we can call next function after sout(); continuing till end  ex line 11 22 26 30
         */
    }

    static  void message1() {
        System.out.println("Hello World");
        message2();
    }
    static  void message2() {
        System.out.println("Hello World");
        message3();
    }
    static  void message3() {
        System.out.println("Hello World");
        message4();
    }
    static  void message4() {
        System.out.println("Hello World");
    }
}
