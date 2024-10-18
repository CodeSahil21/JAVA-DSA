package com.sahil;

import java.util.Arrays;

public class VARARGS {
    public static void main(String[] args) {
     // fun(2 ,3 ,4 , 5 , 56 , 87 , 23 , 45 , 65);
        multiple( 2  , 3 , "KUNAL" , "Rahul" , "YUJI");
    }

    static  void multiple(int a, int b, String ...v) {

    }
    static  void fun(int...v) { // if we put String here we need to give string at line no 7 too instead numbers
        //int...v or string...v means array(collection) of int or String etc
System.out.println(Arrays.toString(v));
    }
}
// when we create method which create variable number of argument is known as variable length argument or
// (when we don't know how many inputs we are giving
// therefore syntax is telling the compiler that function fun can be called via 0 or more 0 zero arguments