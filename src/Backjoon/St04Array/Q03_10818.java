package Backjoon.St04Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q03_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        int min = ary[0];
        int max = ary[0];

        for (int i = 0; i < N; i++) {
            if (ary[i] < min) {
                min = ary[i];
            }
            if (ary[i] > max) {
                max = ary[i];
            }
        }
        System.out.println(min + "\n" + max);
    }

}
