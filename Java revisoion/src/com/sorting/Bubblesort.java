package com.sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3 , 2 , 1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int First, int Second){
          int temp = arr[First];
          arr[First] = arr[Second];
          arr[Second] =  temp;
    }
    static void bubblesort(int[] arr){
        boolean swapped;// if sorting does not occur use this break
//run the step N-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each array max item will come at last
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                //swap
                    swap(arr, j,j-1);
                    swapped = true;
                }
            }
           if(!swapped){
               break;
           }
        }
    }
}
