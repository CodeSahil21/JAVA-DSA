package com.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    //stringbuffer : mutable sequence of characters
    public static void main(String[] args) {
//        StringBuffer s = new StringBuffer();
//        s.append("weMakeDevs");
////        String str = s.toString();
////        System.out.println(str);
//
//        //constructor 1
//        StringBuffer a = new StringBuffer();
//
//        //constructor 2
//        StringBuffer b = new StringBuffer("Sahil Singh");
//
//        //constructor 3
//        StringBuffer c = new StringBuffer(30);
//
//        //methods
//        a.append("WeMAkeDevs");
////        a.insert(2,"rahul");
//        a.replace(1,5,"kushwaha");
//        a.delete(1,5);
//        a.reverse();
//        String str = a.toString();
//        System.out.println(str);
        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        //remove whitespaces
        // remove whitespaces

        String sentence = "Hi h   hjh  hjkso  siowi     w ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // split

        String arr = "Kunal,Apoorv,Rahul,Snehal";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
    }
//advantages: over string
/*
1)mutable
2)efficient
3)thread safe(hence it si slower) and Stringbuilder is not thread safe
*/