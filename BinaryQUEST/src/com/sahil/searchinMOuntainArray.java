package com.sahil;

public class searchinMOuntainArray {
    public static void main(String[] args) {
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstry = orderAgnosticsBS(arr, target , 0, peak);
        if (firstry != -1) {
            return firstry;
        }
        // try to search in second half
        return orderAgnosticsBS(arr , target, peak+1, arr.length-1);

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the decscending part of array
                // this may be the  answer  but look at left
                // this why end != mid -1
                end = mid;
            } else {
                // you are in ascending order
                start = mid +1 ; // because we know that mid + 1 element > mid elemnt
            }
        }
        // in the end start == end pointing the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence when they are pointing to one element ie max element because that is what check says
        // mor elaboration : at every point of start and end they have  the best possible answer till that time
        // and iwe are saying that only one item is remaining, hence cuz of above line that is the best possible answer
        return  start; //or return end as both are equal
    }
    static int orderAgnosticsBS(int[] arr, int target, int start, int end) {

        // find whether array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
            int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

            if (arr[middle] == target) {
                return middle;
            }
            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }
            }
        }


        return -1;
    }
}