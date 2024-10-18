package com.sahil;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {3, 5 ,1 ,2 , 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;// to place number at correct index
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else{
                i++;// it means otherwise move ahead
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
