package com.Arrays.Questions;

import java.util.Arrays;

public class numberssmaller {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};



    }
    static int[] countsmallerno(int[] nums){
        int[] ans = new int[nums.length];//in order to return ans in array we first create and array
        for(int i = 0;i<nums.length;i++){
            int count = 0;//initiallise temp varaible
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
                ans[i] = count;
            }
        }

        return ans ;
    }
}
