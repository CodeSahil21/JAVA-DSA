package com.sahil;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        subseq(" ","abc");
        System.out.println(subseqret(" ","abc"));


    }
    // when to use
    /*
    use in case of permutation and combinations
    subsets->  Non - adjacent collection
    ex [3, 5,9] -> [3], [3,5], [5,9], [3,9], [3,5,9], [5,9]
    this pattern of taking some elements and removing some elements is known as subset pattern

     */

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char str = up.charAt(0);
        subseq(p+str,up.substring(1));
        subseq(p,up.substring(1));

    }
    static ArrayList<String> subseqret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char str = up.charAt(0);
     ArrayList<String> left =   subseqret(p+str,up.substring(1));
        ArrayList<String> right =  subseqret(p,up.substring(1));

        left.addAll(right);
        return left;

    }


}
