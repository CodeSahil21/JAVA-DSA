package com.LInearsearching;

public class LinearSearch {
public static void main(String[] args){
    int[] arr = {32,63,54,89,77,93,68,43};
    int target = 77;
    int ans = Lineasearch(arr,target);
    System.out.println(ans);

}
static int Lineasearch(int[] arr, int target){
    if(arr.length == 0){//if there are zero array elements
        return -1;
    }
    for (int element:arr){
        if(element == target){
            return element;
        }
    }
    return -1;

}
}
