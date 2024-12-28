package Backjoon.조건문;

import java.util.Scanner;

public class j2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int years = sc.nextInt();

        // 연도가 주어질 시, 윤년이면 1, 아니면 0을 출력
        // 윤년은 연도가 4의 배수이며, 100의 배수가 아닐 떄 또는 400의 배수
        if (years % 4 == 0 && (years % 100 != 0 || years % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
}
