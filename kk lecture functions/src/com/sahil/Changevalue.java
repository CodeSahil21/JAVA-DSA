package com.sahil;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        //create an Array
      int[] arr = { 1 , 2 ,3 ,4 ,5};
      change(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void change(int[]nums) {
        nums[0] = 99; // here we were able to change string or swap because we modified it and not created new object
                      // if we make change via this reference variable , same object will change
    }
}


