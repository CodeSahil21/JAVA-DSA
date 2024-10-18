package com.sahil;

public class CEILINGOFARRAY {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 6 , 9, 12 ,14, 16 ,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the smallest no >= 15

    static int ceiling(int[] arr, int target) {

        // but what if target element is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                // find the middle element
                // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
                int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    return middle;
                }
            }
            return start;
        }
    }





// question
/*
arr = [ 2, 3 , 5, 9 , 14 , 16, 18]
 ceiling = smallest element in array greater or = target
 for example: 1)target element = 14 therefore ceiling = 14
 2)target element = 15 then ceiling = (because there is no element = 15 hence ceiling element will be number greater than
   15 ie 16 and 18 out of both 16 is smallest  hence ceiling element will be 16)
   3) target = 4 step1) find the number greater than equal to target ie 5 , 9 ,16, 18 outof which 5 is smallest hence
   ceiling = 5

 */