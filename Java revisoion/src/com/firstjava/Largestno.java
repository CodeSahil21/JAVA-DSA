package com.firstjava;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = input.nextInt();
        System.out.println("Enter number2");
        int b = input.nextInt();
        int largest = Math.max(a,b);
        System.out.println("The largest number is " + largest );
    }
}
