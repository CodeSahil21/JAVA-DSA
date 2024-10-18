package com.sahil;

public class SEARCHSTRINGS {
    public static void main(String[] args) {
        String name = "SAHIL";
        char target = 'H';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) { // arr.length does not have bracket because its not function(it is variable internally)
            // and star.length is function
           return false;
        }
        for (int i = 0; i < str.length() ; i++) {
           if ( target == str.charAt(i));
           return true;
        }
        return false;
    }

    }