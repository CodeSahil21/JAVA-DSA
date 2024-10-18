package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    //declare 1d array
    int[] arr3;
     arr3 = new int[8];
    // intialize 1D array
    int[] arr1D = {2,3,4,5,6,7};
    //intialize 2D array
    int[][] arr2D = {
            {2,4,6,8},
            {8,9,10},
            {2,3}
    };
    //printing 1D array
    System.out.println(Arrays.toString(arr1D));
    //printing 2D array
    for (int row = 0; row < arr2D.length; row++) {
        for (int col = 0; col < arr2D[row].length; col++) {
            System.out.print(arr2D[row][col] + " ");
        }
        System.out.println();

    }
    //take 1D array input
    System.out.println("Enter the number of elements");
    int n =  in.nextInt();
    int[] arr = new int[n];
    //enter array elements
    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
    }
    for (int i = 0; i <n; i++) {
        System.out.print(arr[i]);
    }
    //take 2D array as output
    System.out.println("Enter no of rows");
     int r = in.nextInt();
    System.out.println("Enter no of columns");
   int c = in.nextInt();

    int[][] arr2d= new int[r][c];
    System.out.println("Enter array elemnts");
    for (int row = 0; row < arr2d.length; row++) {
        for (int col = 0; col < arr2d[row].length ; col++) {
            arr2d[row][col] = in.nextInt();
        }

    }
    System.out.println("printing 2d arrays");
    for (int row = 0; row < arr2d.length; row++) {
        for (int col = 0; col < arr2d[row].length ; col++) {
            System.out.print(arr2d[row][col] + " ");
        }
        System.out.println();
        ArrayList<Integer> lists = new ArrayList<>();

     }
    //
}
}
