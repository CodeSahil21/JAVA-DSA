package com.sahil;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
    // String message = greet();
    // System.out.println(message);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter YOur NAme");
        String name = in.next();
        String personalized = mygreet(name);
        System.out.println(personalized);
    }

  static  String mygreet(String name) {
        String message = "hello randi " +  name;
        return message;

  }



  //  static String  greet() {
    //    String greeting =  "how are you";
    //    return greeting; // if required  return is string then return  also must be string not int



}
