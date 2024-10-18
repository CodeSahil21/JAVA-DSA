package com.basics;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Please Enter Temperature in C:");

        Float tempc = input.nextFloat();
        Float tempF =  (tempc * 9/5) + 32;
        System.out.print(tempF);
    }
}
