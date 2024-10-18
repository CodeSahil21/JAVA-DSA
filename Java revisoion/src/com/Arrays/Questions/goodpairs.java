package com.Arrays.Questions;
public class goodpairs{
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
       pairs(nums);


    }
    static void pairs(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i+1; j <nums.length ; j++) {
                System.out.print     ("("+current + ","+ nums[j]  +")");
            }
            System.out.println();
        }
    }
}