package Backjoon.St02ConditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q05_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (H == 0 && M < 45) {
            H = 23;
            M = (60 + M) - 45;
        } else if (M < 45) {
            H -= 1;
            M = (60 + M) - 45;
        } else {
            M -= 45;
        }

        System.out.print(H + " " + M);
    }
}
