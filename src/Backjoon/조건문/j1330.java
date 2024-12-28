package Backjoon.조건문;

import java.util.Scanner;

public class j1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCase1 = sc.nextInt();
        int numCase2 = sc.nextInt();
/*
        if (numCase1 == numCase2) {
            System.out.println("==");
        } else if (numCase1 < numCase2) {
            System.out.println("<");
        } else {
            System.out.println(">");
        }*/

        String result = (numCase1> numCase2) ? ">" : ((numCase1 < numCase2) ? "<" : "==");
        System.out.println(result);
    }
}
