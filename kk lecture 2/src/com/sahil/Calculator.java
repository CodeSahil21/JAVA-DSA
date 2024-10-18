package com.sahil;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  take input from user till user does press X or x
        int ans = 0;
    while (true) {
        // take operator as input
        System.out.print("Enter The Operator");
        char op = input.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*'|| op == '/' || op == '%'){
            // input two numbers and it is infinite whu\ile loop we need a condition to break it
            System.out.print("Enter Two Numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

           if (op == '+') {
               ans = num1 + num2;

           }
            if (op == '-') {
                ans = num1 - num2;
            }

            if (op == '*') {
                ans = num1 * num2;
            }

            if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                }

                if ( op == '%') {
                    ans = num1 % num2;
                }

                } else if (op == 'x' || op == 'X') {
                    break;
                }  else {
                    System.out.print(" Invalid Operation!!");

            }


        }

    }
        System.out.println(ans);
    }
}
