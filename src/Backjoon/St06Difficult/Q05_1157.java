package Backjoon.St06Difficult;

import java.util.Scanner;

public class Q05_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (65 < str.charAt(i) && str.charAt(i) <= 90) {
                arr[str.charAt(i) - 65]++;
            }
            else {
                arr[str.charAt(i) - 97]++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자출력
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}