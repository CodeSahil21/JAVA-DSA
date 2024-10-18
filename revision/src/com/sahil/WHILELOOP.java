package com.sahil;

import java.util.Scanner;

public class WHILELOOP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       /*
       syntax while loop:
       initialisation
       while(condition {
       //body
       increment decrement
       }
        */

    int num  = 1;
    while ( num <= n) {
        System.out.println(num);
        num += 1;

    }

    }
}
