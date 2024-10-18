package com.sahil;

public class QuestMax {
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 23 ,46 , 56 , 63};
        System.out.println(maxrange(arr, 1, 3));

    }
    static int max(int [] arr) {
        int maxvalue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }

        }
        return maxvalue;
    }
    static int maxrange(int [] arr, int start , int end) {
        int maxvalue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }

        }
        return maxvalue;
    }
}
