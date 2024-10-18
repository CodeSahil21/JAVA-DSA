package com.firstjava;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input : ");
        char input = in.next().trim().charAt(0);
        if(input >='a' && input <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
}
