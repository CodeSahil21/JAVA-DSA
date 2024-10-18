package com.sahil;

import java.util.Arrays;

public class binarysearchrecurr {
    public static void main(String[] args) {
      int[] arr = {1, 2 , 3 ,4 ,55 , 66 , 78};
      int target = 78;
        System.out.println(search(arr, target,  0 , arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }
        int m = s + (e - s ) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target , s , m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
// working with variables in recursion
/*
variables
arguments , return type , body of function
 */
// binary search
/*
two steps are
1) comparing o(1)
2) dividing in half ie N/2
recurence relation ie o(1) +f(N/2)


types of recurrence relation
1) linear recurrence relation =  fibonachi
2) divide and concur = binary search( search space is reduce by factor )
// continuation of where to take which variables

 */