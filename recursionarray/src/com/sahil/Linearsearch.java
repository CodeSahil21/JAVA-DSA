package com.sahil;

import java.util.ArrayList;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 23 , 45 , 65, 65 ,86 ,89};
        System.out.println(find(arr,45,0));
        System.out.println(findIndex(arr,45,0));
        System.out.println(findIndexLast(arr, 45,arr.length-1));
       findAllIndex(arr, 65, 0);
        System.out.println(list);


    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findIndex(arr, target, index + 1);
        }

    }
    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findIndexLast(arr, target, index - 1);
        }

    }
  static  ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
             findAllIndex(arr, target, index + 1);


    }
}
