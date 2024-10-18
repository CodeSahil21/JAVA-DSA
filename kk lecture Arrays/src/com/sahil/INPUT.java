package com.sahil;

import java.util.Arrays;
import java.util.Scanner;

public class INPUT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // arrays of primitives
       arr[0] = 23;
       arr[1] = 45;
       arr[2] = 67;
        arr[3] = 489;
        arr[4] = 33;
        // internally it has store { 23 , 45 , 67, 489, 33}
        System.out.println(arr[3]);

        // inputs using for loops
       for  (int i = 0; i < arr.length; i++ ) { // we use arr.length when we don 't know size of array.
         //   arr[i] = in.nextInt();
        }
       System.out.print(Arrays.toString(arr)); // it covert array to string and internally it uses for each loop
        //ex it takes integer array over here and converts it into string

        for  (int i = 0; i < arr.length; i++ ) { // we use arr.length when we don't know size of array.
            System.out.print(arr[i] + " ");
        }
        for (int num : arr) { // for every element in array , print the element//
            System.out.print(num + " ");// here num represents element of array


            // arrays of object
            String[] str = new String[4];
            for(int i = 0; i < str.length; i++) {
                str[i] = in.next();
            }
            System.out.print(Arrays.toString(str));
            // modifying array
            str[1] = "Sahil";
            System.out.print(Arrays.toString(str));
            
        }
        //System.out.print(arr[5]); //index out of bound error
    }
}
/*
syntax for loop advance or for each loop
for (datatype element : arr)
System.out.print(element + " ");
 */