package Backjoon.St05String; // 패키지 선언 (백준 문제 풀이용 패키지)

/*
 * 문제 번호: 5622 (다이얼)
 * 문제 설명:
 *   - 알파벳이 주어질 때, 숫자 버튼을 누르는데 걸리는 시간을 계산하는 문제
 *   - 숫자 '1'을 누를 때 기본적으로 2초가 걸리며,
 *     이후 해당 알파벳이 대응되는 다이얼 숫자를 누르는데 걸리는 시간이 다름
 *   - 예를 들어 'A', 'B', 'C'는 '2' 버튼에 해당하며, 걸리는 시간은 3초
 *   - 동일한 방식으로 모든 알파벳을 숫자로 변환하여 시간을 계산
 */

import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 임포트

public class j5622 {
    public static void main(String[] args) {
        int time = 0; // 총 소요 시간을 저장할 변수

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성 (사용자 입력 받기)
        String phoneNumber = sc.nextLine(); // 사용자 입력을 문자열로 받음
        int stringLength = phoneNumber.length(); // 입력된 문자열의 길이를 저장

        // 입력된 문자열의 각 문자에 대해 다이얼 시간을 계산
        for (int i = 0; i < stringLength; i++) {
            char currentChar = phoneNumber.charAt(i); // 현재 문자를 가져옴

            // 다이얼 숫자와 소요 시간에 대한 switch 문
            switch (currentChar) {
                case 'A': case 'B': case 'C':
                    time += 3; // '2' 다이얼 (A, B, C) - 3초
                    break;

                case 'D': case 'E': case 'F':
                    time += 4; // '3' 다이얼 (D, E, F) - 4초
                    break;

                case 'G': case 'H': case 'I':
                    time += 5; // '4' 다이얼 (G, H, I) - 5초
                    break;

                case 'J': case 'K': case 'L':
                    time += 6; // '5' 다이얼 (J, K, L) - 6초
                    break;

                case 'M': case 'N': case 'O':
                    time += 7; // '6' 다이얼 (M, N, O) - 7초
                    break;

                case 'P': case 'Q': case 'R': case 'S':
                    time += 8; // '7' 다이얼 (P, Q, R, S) - 8초
                    break;

                case 'T': case 'U': case 'V':
                    time += 9; // '8' 다이얼 (T, U, V) - 9초
                    break;

                case 'W': case 'X': case 'Y': case 'Z':
                    time += 10; // '9' 다이얼 (W, X, Y, Z) - 10초
                    break;
            }
        }

        // 최종적으로 계산된 시간 출력
        System.out.println(time);
    }
}
