package com.sahil;

public class LINEARSEARCH {
    public static void main(String[] args) {
        int[] nums =  { 23 , 45 , 68,  38, 67 , 89, 99 };
        int target = 67;
        int ans = linearsearch2(nums , target);
        System.out.println(ans);

    }

    // Search the target and the return true or false
    static int  linearsearch2(int [] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }

    /*    for(int index = 0; index < arr.length; index++){
        int element = arr[index];
        if(element == target) {
        return index;
        }
        }
      */
        //run for loop
        for (int element : arr) { // for every element in array
            //  check the every element at the index if it's equal  the target
            if (element == target) {
               // return element ;
                return 1;
            }

        }
        // this line will execute0 when none of the return statement have executed
        // hence the target not found
        return -1;
    }
// best case 0(1)and worst case is o(n)
// where n is size of array
 }
