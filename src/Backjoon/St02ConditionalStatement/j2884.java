package Backjoon.St02ConditionalStatement;

import java.util.Scanner;

public class j2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 H, M
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 입력받은 숫자보다 45분 빠르게 계산
        if (M < 45) {
            H--; // 시 1 감소
            M = 60 - (45 - M); // 분 감소
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
