package com.LInearsearching;

public class SearchINSTRINGS {
    public static void main(String[] args) {
        System.out.println(search("SAHIL",'H'));


    }
    static boolean search(String name,char target){
        if(name.length() == 0){
            return false;
        }
        for (int  i = 0; i <name.length() ; i++) {
            if(target == name.charAt(i)){
                return true;
            }


        }
        return false;
    }
}
