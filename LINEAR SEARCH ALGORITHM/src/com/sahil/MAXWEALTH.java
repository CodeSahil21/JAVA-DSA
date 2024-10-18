package com.sahil;

public class MAXWEALTH {
    public static void main(String[] args) {

    }
    public int maximumwealth(int[][] accounts ) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
           // when you start a new col take a new sum for that row
           int sum = 0;
            for (int acoounts = 0; acoounts < accounts[person].length; acoounts++) {
                sum += accounts[person][acoounts];
                }
            // now we  have sum of acoounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
// sunmit at leetcode
