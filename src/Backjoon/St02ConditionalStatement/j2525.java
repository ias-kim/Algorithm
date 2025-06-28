package Backjoon.St02ConditionalStatement;

import java.util.Scanner;

public class j2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // h, m 입력
        int h = sc.nextInt();
        int m = sc.nextInt();

        // 경과 시간 추가
        int time = sc.nextInt();

        int min = h * 60 + m; // 시 -> 분
        min += time;

        h = (min / 60) % 24;
        m = min % 60;

        System.out.println(h + " " + m);

    }
}
