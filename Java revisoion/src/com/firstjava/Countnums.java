package com.firstjava;

import java.util.Scanner;

public class Countnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int count = 0;
        while(num!=0){
            int rem = num % 10;
                    if(rem == 5){
                        count++;
                    }
                    num /= 10;
        }
        System.out.println(count);
    }
}
