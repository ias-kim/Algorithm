package Backjoon.St01InputOutput;

import java.util.Scanner;

public class Q05_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        sc.close();

        System.out.println(a / b);
    }
}
