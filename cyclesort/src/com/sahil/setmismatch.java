package com.sahil;

public class setmismatch {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correct = arr[i]-1 ;// to place number at correct index// from 1 to n = arr[i]-1and for 0 to 1 arr[i]
            if( arr[i] != arr[correct]){//arr[i] < arr.length we dont need because it is needed to skiip to N
                swap(arr, i , correct);
            }else{
                i++;// it means otherwise move ahead
            }
        }

        //search for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return new int[] {arr[index] , index+1};
            }
        }
        return new int[] {1, -1};

    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
