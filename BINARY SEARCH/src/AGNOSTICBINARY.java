public class AGNOSTICBINARY {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80 , 90, 330, 530};
        int target = 80;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);

        // in this don't know whether array is sorted in ascending or descending order
        // we can find out whether it is ascending or descending order by comparing first and last number
        // if start > end decreasing, start < end increasing
    }
    static int orderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end   = arr.length-1;
        // find whether array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
            int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

            if (arr[middle] == target) {
                return middle;
            }
            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }
            }
        }


        return -1;
    }
}

