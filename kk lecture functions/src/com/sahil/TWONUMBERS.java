package com.sahil;

import java.util.Scanner;

public class TWONUMBERS  {
    public static void main(String[] args) {
        // take input of two numbers and print thesum
        Scanner in = new Scanner(System.in);
        int num1, num2,sum;

        System.out.print("ENTER NUMBER 1");
        num1 = in.nextInt();
        System.out.print("ENTER NUMBER 2");
        num2 = in.nextInt();
        sum = num1 * num2;
        System.out.print("THE sum =" + sum);

    }
}
