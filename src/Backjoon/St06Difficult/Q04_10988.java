package Backjoon.St06Difficult;

import java.util.Scanner;

public class Q04_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int len = str.length();
        int ans = 1;

        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1) ) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
