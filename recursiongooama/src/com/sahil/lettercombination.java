package com.sahil;

import java.util.ArrayList;

public class lettercombination {
    public static void main(String[] args) {
        pad("","12");
        System.out.println( padList("","12"));
        System.out.println(padcount("","12"));
    }
     static void pad(String p, String up){
         if(up.isEmpty()){
             System.out.println(p);
             return;
         }

         int digit = up.charAt(0) - '0';// this will convert 2 into 2
         for (int i = (digit - 1) * 3; i < digit*3 ; i++) {
             char ch = (char)('a' + i);
             pad(p+ch,up.substring(1));

         }
    }
    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        int digit = up.charAt(0) - '0';// this will convert 2 into 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit*3 ; i++) {
            char ch = (char)('a' + i);
       list.addAll(padList(p+ch,up.substring(1)));

        }
        return list;
    }
    static int padcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
       int count = 0;
        int digit = up.charAt(0) - '0';// this will convert 2 into 2
        for (int i = (digit - 1) * 3; i < digit*3 ; i++) {
            char ch = (char)('a' + i);
           count = count + padcount(p+ch,up.substring(1));

        }
        return count;
    }
}
