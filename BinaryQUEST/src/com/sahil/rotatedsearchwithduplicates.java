package com.sahil;

public class rotatedsearchwithduplicates {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    // this will not work for duplicate values
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you do not find pivot , it means array is not rotated
        if(pivot == -1) {
            // do normal binary search
            return binarysearch(nums , target, 0,nums.length-1);
        }
        // if pivot is found you have found 2 asc sorted arrays
        // case 1
        if (nums[pivot] == target) {
            return pivot;
        }
        // case 2
        if (target >= nums[0]) {
            return binarysearch(nums , target, 0 , pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarysearch(int[] arr, int target, int start , int end) {

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
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end ) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] >arr[mid+1]) {// we use mid < end to avoid index out of bound if mid is last element
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]) {// we uses mid > start to avoid index out of bound error if mid is 1st element
                return mid- 1;
            }
            if (arr[mid]<= arr[start]) {
                return mid -1;
            }else {
                return  mid +1;
            }
        }
        return -1;
    }
    static int findPivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end ) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] >arr[mid+1]) {// we use mid < end to avoid index out of bound if mid is last element
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]) {// we uses mid > start to avoid index out of bound error if mid is 1st element
                return mid- 1;
            }
           // if elements at middle , start , end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                //NOTE: what if these elemnts at start and end are pivot?
                //check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
               // check whether end is pivot
               if (arr[end]>arr[end-1]) {
                   return end;
               }
                end --;
            }
            // left side is sorted so pivot should on right side
            else if (arr[start] <arr[mid] ||( arr[start] == arr[mid] && arr[mid] >arr[end])) {
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}

