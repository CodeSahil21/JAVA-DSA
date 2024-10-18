import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {10 , 20 ,57, 67 , 33};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;//n-1
            int maxindex = getMaxIndex(arr,0,last);
            swap(arr,maxindex,last);//to swap max with last one

        }
    }

    static void swap(int[] arr,int  first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max =  start;

        for (int i = start; i <= end ; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
      return max;
    }


}
