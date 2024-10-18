package com.sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {10 , 20 ,57, 67 , 33};
        Selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void swap(int[] arr, int first,int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
     private static int getmaxindex(int[] arr,int first,int second){
        int max = first;
         for (int i = first; i <=second ; i++) {
             if(arr[max]<arr[i]){
                 max = i;
             }
         }
         return max;
     }
     static void Selectionsort(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             int last = arr.length-i-1;//n-1
             int maxindex = getmaxindex(arr,0,last);//find max index
             swap(arr,maxindex,last);//to swap max with last one

         }
     }

}
