package com.sahil;

public class MINIMUMNUMBER {
    public static void main(String[] args) {
        int[] arr = {7, 56 , 67 ,33, -66 ,84};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans) {
                ans = arr[i];
            }

        }
        return ans;
    }
}
