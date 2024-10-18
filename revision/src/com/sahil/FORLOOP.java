package com.sahil;

import java.util.Scanner;

public class FORLOOP {
    public static void main(String[] args) {
        /*
        syntax for loop
        for (intialisation; condition; increment/decrement) {
        //body}
         */
          // q : print no 1 to n

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1;  num <= n;  num += 1) {
            System.out.println(num);
        }
    }
}
