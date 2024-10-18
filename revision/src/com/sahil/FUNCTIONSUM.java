package com.sahil;

import java.util.Scanner;

public class FUNCTIONSUM {
    public static void main(String[] args) {
      int ans =  add();
      System.out.println(ans);
    }
    static int add() { // instead of void we use return for return value
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

       return sum; // this line means end of the function and if required return is string then retuirn value must
        // be string or same can be said for other variables ex int char etc
    }
}
