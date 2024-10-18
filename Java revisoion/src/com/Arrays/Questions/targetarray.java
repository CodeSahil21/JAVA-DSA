package com.Arrays.Questions;

public class targetarray {
    public static void main(String[] args) {

    }
    static int[] target(int[] nums,int[] index){
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            for (int j = target.length-1; j >index[i] ; j++) {
                target[j] = target[j-1];

            }
            target[index[i]] = nums[i];

        }
        return target;
    }
}
