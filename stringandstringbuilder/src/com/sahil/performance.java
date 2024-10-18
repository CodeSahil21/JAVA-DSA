package com.sahil;

public class performance {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
        //    series = series + ch;// series += ch
// this will memory lot due above process  creating multiple object for every loop refer lectur 1 hr 7 min part
            //
        }
        System.out.println(series);
    }
}
