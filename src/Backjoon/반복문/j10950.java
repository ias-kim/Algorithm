package Backjoon.반복문;

import java.util.Scanner;

public class j10950 {
    public static void main(String[] args) {
        // t 을 입력받아 n 수 만큼 반복해 두수를 입력후 덧셈
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A, B;
        for (int i = 0; i < T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
