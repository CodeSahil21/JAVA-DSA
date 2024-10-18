package com.sahil;

import java.util.Arrays;

public class REVERSEARRAY {
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 5 ,34 , 46 , 77};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr ) {
        int start = 0;
        int end = arr.length-1;  //arr.length-1 menans array of 6 number its last index number will be 5 ie 6 -1=5

        while (start < end)  {
           // swap
            swap(arr, start, end );
            start++;
            end--;
        }
    }

    static  void swap(int[] arr , int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =  temp;
    }
}
