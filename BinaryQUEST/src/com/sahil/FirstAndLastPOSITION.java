package com.sahil;


import java.util.Arrays;

public class FirstAndLastPOSITION {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8,8, 10};
        int target = 7;
        int[] ans = searchRange( nums, target);
        System.out.println(Arrays.toString(ans));
    }

      static int[] searchRange(int[] nums, int target) {  /// for leetcode we use public instead of static

        int[] ans = {-1, -1};
// check for first occurence if target is first
      int start = search(nums, target, true);
      int end = search(nums, target,false);

      ans[0] = start;
      ans[1] = end;

      return ans;
    }
    // this function just returns index value of target
  static int search(int[] nums, int target, boolean findStartIndex ) {

        int ans  =-1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
            // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
            int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

            if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {

                start = middle + 1;
            } else {
                // potential answer found
                ans = middle;
                if (findStartIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }

        }
         return  ans;
    }

    }
