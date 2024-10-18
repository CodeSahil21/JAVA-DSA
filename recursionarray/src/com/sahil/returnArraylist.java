package com.sahil;

import java.util.ArrayList;

public class returnArraylist {
    public static void main(String[] args) {
        int[] arr = {1, 23 , 45 , 65, 65 ,86 ,89};
       // System.out.println(findIndex(arr,65,0,new ArrayList<>()));
       // ArrayList<Integer> ans = findIndex(arr, 65, 0 , new ArrayList<>());
        ///System.out.println(ans);
        System.out.println(find2Index(arr,65,0));


    }
   static  ArrayList<Integer> list = new ArrayList<>();
    static ArrayList findIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
         list.add(index);
        }
            return findIndex(arr, target, index + 1, list);


    }

    static ArrayList find2Index(int[] arr, int target, int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain ans for that function only
        if(arr[index] == target){
            list.add(index);
        }
       ArrayList<Integer> ansFromBelowCalls =  find2Index(arr, target, index + 1 );
        list.addAll(ansFromBelowCalls);

        return list;


    }
}
//alway use appraoch 1