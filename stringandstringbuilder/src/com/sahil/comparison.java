package com.sahil;

public class comparison {
    public static void main(String[] args) {
         String a = "Sahil";
         String b = "Sahil";
      //   How do we know that both variable are pointing toward same value or seperate value
        // proof for String pool ==
      //  System.out.println(a ==b); // its ouput will show true
        // two ways to compare String
        /*
        1) == method // check if reference variable pointing towards same object
        // how to create different objects with same value
        ie, String a = new String("Sahil");
             String b = new String("Sahil")
             // its creating the values outside the pool in heap
             // now we do a == b it will give false
       2) when  you only need to check the values, use " .equals "  method
         */

        String name1 = new String("Singh");
        String name2 = new String("Singh");
        //System.out.println(name1 == name2); // now it shows false
       // System.out.println(name1.equals(name2)); // in to order to check values// it shows true
        System.out.println(name1.charAt(1));
        /*
        we cannot use sout(name[1]) is we use "charAt()"
         */
    }
}
