package Backjoon.조건문;

import java.util.Scanner;

public class j14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사분면 값 입력
        int x = sc.nextInt();
        int y = sc.nextInt();
        // +,+ 1분면, -,+ 2분면, +,- 3분면, -,- 4분면

        int quadrant = (x > 0 ?
                    (y > 0 ? 1 : 4) :
                    (y < 0 ? 3 : 2));
        System.out.println(quadrant);
    }
}
