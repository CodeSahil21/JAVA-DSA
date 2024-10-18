package com.StringBuffer;

import java.util.Random;

public class RandomString {
    static String generate(int size){
     StringBuffer a = new StringBuffer(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(random.nextFloat()*26);
            a.append((char)randomChar);
        }
        return a.toString();
    }
}
