package com.sahil;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        // how to get Ascii value of character
     //   char ch = 'a';
       // System.out.println(ch + 0);
        subseqAscii(" ","abc");
        System.out.println(subseqretAscii(" ","abc"));

    }
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char str = up.charAt(0);
        subseqAscii(p+str,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p +(str+0),up.substring(1));

    }
    static ArrayList<String> subseqretAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char str = up.charAt(0);
        ArrayList<String> first =   subseqretAscii(p+str,up.substring(1));
        ArrayList<String> second =  subseqretAscii(p,up.substring(1));
        ArrayList<String> third =  subseqretAscii(p+(str+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;


    }

    
}
