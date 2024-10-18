package com.quest;
import java.util.Scanner;

import static com.quest.TwoStacks.twoStacks;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter total rounds you want to play");
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            System.out.println("Enter total sum");
            int target = in.nextInt();
            System.out.println("Enter size of 1st Stack");
            int size1 = in.nextInt();
            System.out.println("Enter size of 2nd Stack");
            int size2 = in.nextInt();
            int[] a = new int[size1];
            int[] b = new int[size2];
            System.out.println("Enter  elements of 1st stack");
            for (int j = 0; j < size1; j++) {
                a[j] = in.nextInt();
            }
            System.out.println("Enter  elements of 2nd stack");
            for (int j = 0; j < size2; j++) {
                b[j] = in.nextInt();
            }
            System.out.println(twoStacks(target,a,b));
        }
        System.out.println("Thank you for playing");
    }
}
