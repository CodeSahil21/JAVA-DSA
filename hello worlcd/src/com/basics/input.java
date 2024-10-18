package com.basics;

import java.util.Scanner;                                     


public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter some some input");
        int rollno = input.nextInt();
        System.out.println("your roll no is " + rollno);

       String name = input.next();
      System.out.println(name);
      float marks = input.nextFloat();
      System.out.println(marks);
    }

}
