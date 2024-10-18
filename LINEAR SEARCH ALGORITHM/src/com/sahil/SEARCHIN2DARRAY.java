package com.sahil;

import java.util.Arrays;

public class SEARCHIN2DARRAY {
    public static void main(String[] args) {
        int[][] arr = {
                {2 , 3 ,5}, //0 row
                {34 , 45 , 64 ,},// 1 row
                {88 , 91 , 40, 67},// row 2
                {57, 12},// row 3
        };
        int target = 67;
        int[] ans = search(arr, target);// format return will be { row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
              if (arr[row][col] == target) {
                  return new int[] {row , col};
              }
            }

        }
        return new int[] {-1 , -1};


    }

}
