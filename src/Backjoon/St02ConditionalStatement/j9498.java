package Backjoon.St02ConditionalStatement;

import java.util.Scanner;

public class j9498 {
    public static void main(String[] args) {
        // 시험점수를 입력받아 a, b, c, d, f 구분
        Scanner sc = new Scanner(System.in);
        int stdGrade = sc.nextInt();

            // 90 이상 A
        if (stdGrade >= 90) {
            System.out.println("A");
            // 80 이상 B
        } else if (stdGrade >= 80) {
            System.out.println("B");
            // 70 이상 C
        } else if (stdGrade >= 70) {
            System.out.println("C");
            // 60 이상 D
        } else if (stdGrade >= 60) {
            System.out.println("D");
            // 나머지 F
        } else {
            System.out.println("F");
        }
    }
}
