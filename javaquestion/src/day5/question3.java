package day5;

import java.util.Scanner;

public class question3 {
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String s[]) {
        printMultiplicationTable(5);
    }

}
