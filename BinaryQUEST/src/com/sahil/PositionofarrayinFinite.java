package com.sahil;

public class PositionofarrayinFinite {
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 12 ,18 ,22 ,28 ,40,50,100,130};
        int target =18;
        System.out.println(findingRange(arr, target));

    }
      static int findingRange(int[] arr, int target){
        // find the range
        // first start with size of box 2
         int start = 0;
         int end = 1;

         // condition for target lie in the range
          // while my target is greater then end keep doubling
          while (target >arr[end]) {
              int temp = end +1; // this my new start
              //double the box value
              //end = previous end(index) + sizeofbox(no of element in previous start and end) *2
              end = end + (end - start + 1) * 2;
              start = temp;
           }
          return binarysearch(arr, target, start, end);
    }
    static int binarysearch(int[] arr, int target, int start, int end) {


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
}
