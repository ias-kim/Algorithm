package Backjoon.St02ConditionalStatement;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int maxNum;
        int result;

        if (A == B && A == C) {
            result = 10000 + A * 1000;
        } else if (A == B || B == C || C == A ) {
            maxNum = (A == B) || (A == C) ? A : B;
            result = 1000 + maxNum * 100;
        } else {
            maxNum = (A > B) ?
                    ((A > C) ? A : C) :
                    ((B > C) ? B : C);
            result = maxNum * 100;
        }

        System.out.println(result);
    }
}
