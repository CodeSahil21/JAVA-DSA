package com.sahil;



public class SEARCHINRANGE {
    public static void main(String[] args) {
        // in this we are going to search target b/w range[x,y]
         int[] arr = {7, 56 , 67 ,33, 66 ,84, 89 , 94};
         int target = 66;
        System.out.println(linearsearch(arr, target,1, 4));
    }
    static int  linearsearch(int [] arr , int target , int start , int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start ; i <= end ; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }


        // this line will execute0 when none of the return statement have executed
        // hence the target not found
        return -1;
    }
}
