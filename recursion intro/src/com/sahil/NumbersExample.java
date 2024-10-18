package com.sahil;

public class NumbersExample {
    public static void main(String[] args) {
       // write a function that takes in a number and prints it
       //print first 5 numbers: 1 2 3 4 5
      print1(1);
    }

    // this a function calling another function
    // all these have one thing in common ie body and definition of functions are same
    // working of functions calls in language
    /*
    1) while the main function or any other function is not finished executing it will remain  in stack
    // main function will start to execute first and complete at last
    // main function will be called in  stack and // main is the first function in programming language
    // when function in staying in the stack it means function call is going on

    2) when the function finishes executing it is removed from the stack  and the flow of program is restored to where that function was called
//ie from print5 to print4(it calls print 5) to print3(it calls print4) to print2(it calls print3) to print1(it calls print2) to main function(it calls print1)


     */
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

   // func body changes
    static void print5(int n){

        System.out.println(n);
    }


}
