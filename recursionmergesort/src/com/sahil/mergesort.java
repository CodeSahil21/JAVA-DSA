package com.sahil;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3 , 2 ,1};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return sort(left, right);
    }

    private static int[] sort(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; //pointer for array1
        int j = 0; /// pointer of array two
        int k = 0;// pointer for array

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) { //  to check element of which array is smaller
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;

            }
            k++;
        }
// it may be possible one of the arrays is not complete;
        // copy the remaining elements

           while(i<first.length){
               mix[k] = first[i];
               i++;
               k++;
           }

        while(j<second.length){
            mix[k] = first[j];
           j++;
            k++;
        }
        return mix;
    }
}