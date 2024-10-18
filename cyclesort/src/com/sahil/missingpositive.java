package com.sahil;

public class missingpositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] arr) {
        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1 ;// to place number at correct index
            if(arr[i]> 0 && arr[i] < arr.length && arr[i] != arr[correct]){//arr[i]> 0 we use this  to ignore negative
                swap(arr, i , correct);
            }else{
                i++;// it means otherwise move ahead
            }
        }

        //search for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index +1){
                return index +1;
            }
        }
        //case 2
        return arr.length + 1;// if all element are sorted without missing number then return N+1 where N is last element
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


