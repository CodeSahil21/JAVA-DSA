package com.sahil;

import java.util.Arrays;

public class inplace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3 , 2 ,1};
         merge(arr, 0 ,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void merge(int[] arr, int s, int e) {
        if (e-s == 1) {
            return ;
        }

        int mid = (s+e)/ 2;

       merge(arr,s , mid);
       merge(arr, mid, e);

        sort (arr,s , mid ,e);
    }

    private static void sort(int[] arr, int s, int mid, int e ){
        int[] mix = new int[e-s];

        int i = s; //pointer for array1
        int j = mid; /// pointer of array two
        int k = 0;// pointer for array

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) { //  to check element of which array is smaller
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }
// it may be possible one of the arrays is not complete;
        // copy the remaining elements

        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] =mix[l];
            
        }
    }
}
