import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3 , 2 , 1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubblesort(int[] arr){
        boolean swapped; // in case of sorted array swapping doesnot occur
         // run the steps in N-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each array max item will come in last index
            for (int j = 1; j < arr.length-i ; j++) {// j will sort array step by step 
                // swap if the item is smaller than the previous item
               if (arr[j] < arr[j-1]) {
                    //swap
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap value for particular value of  i, it means the array is sorted hence
            if(!swapped){ //!false =true
                break;
            }
        }
    }
}
