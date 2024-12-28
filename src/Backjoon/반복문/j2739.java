package Backjoon.반복문;

import java.util.Scanner;

public class j2739 {
    public static void main(String[] args) {
        // n을 입력받은 뒤, 구구단을 출력하는 프로그램
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }

    }
}
