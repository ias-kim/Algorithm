package Backjoon.반복문;

import java.util.Scanner;

public class j25304 {
    public static void main(String[] args) {
        // 총금액과 물픔 개수와 가격이 맞는 프로그램 작성

        Scanner sc = new Scanner(System.in);

        int totalNum = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int won = sc.nextInt();
            int series = sc.nextInt();
            totalNum -= won * series;
        }

        if (totalNum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
