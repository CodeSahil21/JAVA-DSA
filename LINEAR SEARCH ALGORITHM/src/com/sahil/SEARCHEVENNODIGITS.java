package com.sahil;



public class SEARCHEVENNODIGITS {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findnumbers(nums));
       // System.out.println(digits(-457889));
    }
    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) { // advance for loop this line means for very nums in nums
           if (even(num)) {
               count ++;
           }
        }
        return count;
    }
    // function to check whether a number contains even no of digits or not
    static boolean even(int num){
        int  numberofDigits = digits(num);
        if (numberofDigits % 2 == 0) {
            return true;
        }
        return false; // or you can directly write (return numberofDigits % 2 ==0;) instead of line 20, 21 ,22 and 24
    }
   // count no of digits
    static int digits(int num ) {
        if (num <0) {
            num = num * -1;// use these to convert negative and into positive
        }
        if (num == 0) {
            return 1; // we add this  to not count 0 digits
        }

        int count = 0;
        while (num > 0) {
          count++;
          num = num/10; // num/ =10
        }
        return count;
    }
}
/*
how to check whether a number contains even no of digits or not
1count no of digits by using n = n/10
2convert 1764 in "1764"(string)
 */