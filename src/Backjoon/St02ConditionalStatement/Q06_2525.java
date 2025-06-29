package Backjoon.St02ConditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q06_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 경과 시간
        int time = Integer.parseInt(br.readLine());

        int min = H * 60 + M; // 시를 분으로 변환
        min += time;

        H = (min / 60) % 24;
        M = min % 60;

        System.out.println(H + " " + M);
    }
}
