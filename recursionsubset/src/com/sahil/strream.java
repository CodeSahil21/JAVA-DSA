package com.sahil;

public class strream {
    public static void main(String[] args) {
       skip("  ","baccad");
        System.out.println(skipApple("baccadh"));
        System.out.println(skipMango("yuji Mango itadori"));

    }
    static void skip(String p, String up){
        //p = process , up = unprocess
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ ch,up.substring(1));
        }
    }
//to return string
    static String skipApple( String up){
        //p = process , up = unprocess
        if(up.isEmpty()){
            return"";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
          return  skipApple(up.substring(1));
        }else{
         return  ch +  skipApple(up.substring(1));
        }
    }
    // to skip a string
    static String skipMango( String up){
        //p = process , up = unprocess
        if(up.isEmpty()){
            return"";
        }

        if(up.startsWith("Mango")){
            return  skipMango(up.substring(5)); // size of mango 5 hence substring5
        }else{
            return  up.charAt(0) +  skipMango(up.substring(1));
        }
    }
}
