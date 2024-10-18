package com.sahil;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
        syntax for loop :
        for (initialisation; condition; Increment/Decrement) {
        // body
        }
         */
        // Q : print no 1 to 5
       // for (int num = 1; num<=5; num += 1 ) {
        //    System.out.println(num);
      //  }

        // Q : print no 1 to n
        Scanner input = new Scanner(System.in);
      //  int n = input.nextInt();

    //    for ( int num = 1; num <= n;  num++) {
           // System.out.print(num + " ");
     //       System.out.println("hello world");

        // While loops
        /* Syntax for while loop
        initialisation
        while (condition)   {
         // body
         Increment/decrement
        }
         */
   //     int num = 1;
     //   while (num <= 10) {
       //     System.out.println(num);
       //     num ++;

        // do while loop :
        /*
        initialisation
        do {
        // body
        increment/decrement
        } while (condition);
         */
       int n = 1;
       do {
           System.out.println(n);
           n++;
       } while ( n<= 5);



    }
}
