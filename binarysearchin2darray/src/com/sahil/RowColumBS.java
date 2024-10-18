package com.sahil;

import java.util.Arrays;
// search in matrices
public class RowColumBS {
    public static void main(String[] arg){
        int[][] arr ={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr,37)));

    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;// last column elements of matrix

        while( row < matrix.length && col >= 0){
            if(matrix[row][col] == target) { // matrix[row][col] =element
                return new int[] {row, col};
            }
            if(matrix[row][col] < target) {
               row++;
            }else{
                col--;
            }

        }
        return new int[] {-1, 1};
/*
worst case is n^2
here try to eliminate row and column
 */



    }
}

