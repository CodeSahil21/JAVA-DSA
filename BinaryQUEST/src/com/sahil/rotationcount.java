package com.sahil;

public class rotationcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countrotations(arr));
    }

    private static int countrotations(int[] arr) {
     int pivot = findPivot(arr);
     return pivot +1;
    }
    // use this for non duplicates


    // use this for non duplicates

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
    // use this for duplicates
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
