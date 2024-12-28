package Backjoon.조건문;

import java.util.Scanner;

public class j2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || a == c || b == c) {
            int maxNum = (a == b) || (a == c) ? a : b;
            System.out.println(1000 + (maxNum * 100));
        } else {
            int maxNum = (a > b) ?
                    ((a > c) ? a : c) :
                    ((b > c) ? b : c);
            System.out.println(maxNum * 100);
        }
    }
}
