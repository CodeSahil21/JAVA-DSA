package com.sahil;

public class OVERLOADING {
    public static void main(String[] args) {
        fun(67);// it will call function at line 8
        fun("kunal"); // it will call function at line 13
    }
    static void fun(int a) {
        System.out.println("FIRST ONE");
        System.out.println(a);

    }
    static void fun(String name) {
        System.out.println("SECOND ONE");
        System.out.println(name);
    }
}
// if we have two  or more function of same name can exist if parameters are different
// it happens when our programm gets compiled during runtime
// condition either no if arguments must be different or type of arguments must be different