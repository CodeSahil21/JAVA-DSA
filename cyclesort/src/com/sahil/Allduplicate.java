package com.sahil;

import java.util.ArrayList;
import java.util.List;

public class Allduplicate {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] arr) {

        int i =0;
        while(i < arr.length){
            int correct = arr[i] - 1 ;// to place number at correct index
            if( arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else{
                i++;// it means otherwise move ahead
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                ans.add(arr[index]);// because ans will be arr[index]
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
