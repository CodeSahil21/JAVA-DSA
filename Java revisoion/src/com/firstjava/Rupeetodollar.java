package com.firstjava;

import java.util.Scanner;

public class Rupeetodollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rupees");
        float rupee = input.nextFloat();
     float dollar =  rupee/83.60f;
        System.out.println("dollar is " + dollar);
    }
}
