package com.firstjava;

import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal");
        int p = input.nextInt();
        System.out.println("Enter time period");
        int t = input.nextInt();
        System.out.println("Enter rate of interest");
        int r = input.nextInt();
       int SimpleInterest = (p*r*t)/100;
        System.out.println("Simple Interest is" + SimpleInterest);
    }
}
