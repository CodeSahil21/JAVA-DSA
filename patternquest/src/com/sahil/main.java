package com.sahil;

public class main {
    public static void main(String[] args) {
        pattern5(8);
    }



    static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
             int totalcolsinrow= row > n ? 2 * n - row  : row;
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");

            }
            System.out.println();




        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {// step 1 -
            //for every  row,  run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " " );// use print instead of println since are printing col no hence print col
            }
            // when one row is printed, we need add new line
            System.out.println();

        }

    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {// step 1 -
            //for every  row,  run the col
            for (int col = 1; col <= n - row +1; col++) {
                System.out.print("* ");// use print instead of println
            }
            // when one row is printed, we need add new line
            System.out.println();

        }

    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {// step 1 -
            //for every  row,  run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");// use print instead of println
            }
            // when one row is printed, we need add new line
            System.out.println();

        }

    }
           static void pattern1(int n){
        for (int row = 1; row <= n; row++) {// step 1 -
   //for every  row,  run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");// use print instead of println
            }
            // when one row is printed, we need add new line
            System.out.println();

        }

    }
}
