package com.sahil;

import java.util.Scanner;

public class IFLOOP {
    public static void main(String[] args) {

      int salary = 30000;
    if ( salary > 10000) {
        salary = salary + 3000;
    } else if (salary > 20000) {
      salary += 5000;
    }else {
        salary += 1000;
    }




        System.out.println(salary);
    }

}
