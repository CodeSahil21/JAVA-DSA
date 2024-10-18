package com.sahil;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 6 , 9, 12 ,14, 16 ,18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index greatest no <= 15

    static int floor(int[] arr, int target) {

        // but what if target element is greater than the greatest number in the array
        if (target >arr[arr.length-1]){
            return-1;
        }
        int start = 0;
        int end   = arr.length-1;

        while (start <= end){
            // find the middle element
            // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
            int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

            if (target < arr[middle]) {
                end = middle - 1;
            } else if(target > arr[middle]){
                start = middle + 1;
            } else{
                return middle;
            }
        }
        return end;
    }
}


