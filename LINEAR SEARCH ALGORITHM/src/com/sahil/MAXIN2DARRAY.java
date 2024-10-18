package com.sahil;

import java.util.Arrays;

public class MAXIN2DARRAY {
    public static void main(String[] args) {
        int[][] arr = {
                {2 , 3 ,5}, //0 row
                {34 , 45 , 64 ,},// 1 row
                {88 , 91 , 40, 67},// row 2
                {57, 12},// row 3
        };
        int target = 91;
     //  int[] ans = search(arr, target);// format return will be { row, col}
      //  System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;

    }

}


