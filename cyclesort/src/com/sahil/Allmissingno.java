package com.sahil;

import java.util.ArrayList;
import java.util.List;

// leetcode 448 google
 class Allmissingno {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correct = nums[i] - 1;// to place number at correct index
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;// it means otherwise move ahead
            }
        }
        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index+1);
            }

        }
        return ans;

    }

     void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
