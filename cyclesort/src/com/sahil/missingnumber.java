package com.sahil;
//268 leetcode Amazon
public class missingnumber {
    public static void main(String[] args) {
       int[] arr = {4, 0 , 2 ,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int i =0;
        while(i < arr.length){
            int correct = arr[i] ;// to place number at correct index
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else{
                i++;// it means otherwise move ahead
            }
        }

        //search for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
             return index;
            }
        }
        //case 2
        return arr.length;
    }

   static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
