package com.sahil;

import java.util.Arrays;

public class sortedmatrixbs {
    public static void main(String[] args) {
        int[][] arr = {
                         {1 , 2,  3 },
                         {4, 5 , 6},
                         {7, 8 , 9}
                                    };
        System.out.println(Arrays.toString(search(arr, 6)));

    }
// here we reduce search space by searching on middle column
    static int[] binarysearch(int[][] matrix,int row, int cstart, int cEnd, int target){
        while(cstart <= cEnd){
            int mid =cstart +(cEnd - cstart)/2;
            if(matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cstart = mid +1;
            }else{
                cEnd = mid -1;     // this condition means skip  or ignore the above rows
            }
        }
        return new int[]{-1, 1};
    }
    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;// be cautious matrix may be empty

        if (row == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }
        int rstart = 0;
        int rEnd = row - 1;
        int cmid = cols / 2;
        //run the loop till loops are remaining
        while (rstart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rstart + (rEnd - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            }else{
               rEnd = mid;
            }

    }
        // now we have two rows
        // check whether target is in cols of 2 rows
        if(matrix[rstart][cmid] == target) {
            return new int[]{rstart,cmid};//rstart  = row 1 out of two rows
        }

        if(matrix[rstart+1][cmid] == target) {
            return new int[]{rstart+1,cmid};//rstart+1 = 2nd row out of two rows
        }
        //search in 1st half
        if(target <=  matrix[rstart][cmid -1]){
             return binarysearch(matrix, rstart,0,cmid-1, target);
        }
        //search in 2nd half
        if(target >=  matrix[rstart][cmid +1] && target <=  matrix[rstart][cols- 1]){
            return binarysearch(matrix, rstart,cmid+1,cols-1, target);
        }
        //search in 3rd half
        if(target <=  matrix[rstart+1][cmid -1]){
            return binarysearch(matrix, rstart+1,0,cmid-1, target);
        }else{
            return binarysearch(matrix, rstart+1,cmid+1,cols-1, target);
        }
        //search in 4th half
    }
}
