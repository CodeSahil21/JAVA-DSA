package com.LInearsearching;

public class SEARCHINRANGE {
    public static void main(String[] args) {
        int[] arr = {33,12,45,74,39,97,62,67};
        int target = 39;
        System.out.println(Linearsearch(arr,target,1,5));
    }
    static int Linearsearch(int[] arr,int target,int start ,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if(element == target){
                return 1;
            }

        }
        return  -1;
    }
}
