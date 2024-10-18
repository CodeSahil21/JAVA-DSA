package com.quest;

import java.util.Arrays;

public class TwoStacks {
    static int twoStacks(int target,int[] a,int[] b){
        return twoStacks(target,a,b,0,0)-1;
    }
    private static int twoStacks(int target,int[] a,int[] b,int sum,int count){
       if(sum>target){
           return count;

       }
        if(a.length ==0||b.length==0){
            return count;
        }
       int ans1 = twoStacks(target, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
       int ans2 = twoStacks(target,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
      return Math.max(ans1,ans2);
    }

}
