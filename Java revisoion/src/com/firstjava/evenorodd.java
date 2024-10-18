package com.firstjava;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        if(num%2==0 ){
            System.out.println("Given Integer is Even");
        }else{
            System.out.println("Given Integer is odd");
        }
    }
}
