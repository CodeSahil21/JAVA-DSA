package com.sahil;

public class spiralmatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2 ,3,4},
                {5,6,7,7},
                {9,10,11,12},
                {13,14,15,16}
        };
         printspiral(matrix);
        System.out.println(matrix);

    }
    static void printspiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for (int j = startCol; j <=endCol ; j++) {
                System.out.println(matrix[startRow][j]+ " ");
            }
            //right
            for (int i = startRow+1; i <= endRow ; i++) {
                System.out.println(matrix[i][endCol]+"");
            }
            for (int j = endCol-1; j >=startCol ; j--) {
                System.out.println(matrix[endRow][j]+"");
            }
            for (int i = endRow-1; i >=startRow+1 ; i--) {
                System.out.println(matrix[i][startCol]);
            }
           startRow++;
             endRow --;
             startCol ++;
        endCol --;
        }
        System.out.println();
    }
}
