package com.sahil;

public class smallestletter {
    public static void main(String[] args) {
        String [] letters = {"c","f","j"};
        char target = 15;


    }

    static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            // int middle = (start + end) / 2 // might  be possible that (start + end) / 2 exceeds th range of the int in java results error
            int middle = start + (end - start) / 2;// when we solve it gives  (s +e)/ 2

            if (target < letters[middle]) {
                end = middle - 1;
            } else  {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];

    }
}

