public class BINARYSEARCH {
    public static void main(String[] args) {
          int[] arr = {10, 20, 30, 40, 50, 60, 70, 80 , 90, 330, 530};
          int target = 330;
          int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end   = arr.length-1;

        while (start <= end){
            // find the middle element
 // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
            int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

            if (target < arr[middle]) {
                end = middle - 1;
            } else if(target > arr[middle]){
                start = middle + 1;
            } else{
                return middle;
            }
        }
        return -1;
    }
}
