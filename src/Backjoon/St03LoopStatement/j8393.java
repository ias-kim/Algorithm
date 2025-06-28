package Backjoon.St03LoopStatement;

import java.util.Scanner;

public class j8393 {
    public static void main(String[] args) {
        // n이 주어질 시, 1부터 n까지 구하는 프로그램
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int totalN = 0;
        for (int i = 1; i <= N; i++) {
            totalN += i;
        }
        System.out.println(totalN);

    }
}
