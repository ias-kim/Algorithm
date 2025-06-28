package Backjoon.St03LoopStatement;

import java.util.Scanner;

public class j25314 {
    public static void main(String[] args) {
        // 4의 배수마다 long 반복 출력하는 프로그램 작성
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        num = num / 4;
        for (int i = 0; i < num; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
