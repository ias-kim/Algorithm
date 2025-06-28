package Backjoon.St03LoopStatement;

import java.util.Scanner;

public class j11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d", i+1, A, B, A+B);
            System.out.println();
        }
    }
}
