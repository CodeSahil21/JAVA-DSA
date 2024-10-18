package com.sahil;

public class pattern7 {
    public static void main(String[] args) {
         pattern28(9);
    }

    static void pattern(int n){

    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsinrow= row > n ? 2 * n - row  : row;

            int noofspaces = n - totalcolsinrow;
            for (int space = 0; space < noofspaces; space++) {
                System.out.print(" ");

            }
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");

            }
            System.out.println();




        }
    }
}
