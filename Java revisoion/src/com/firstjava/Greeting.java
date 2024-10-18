package com.firstjava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Hello dear " + name);
    }
}
