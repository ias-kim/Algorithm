package Backjoon.St04Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Q05_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // X~Y번 바구니에 Z번 공을 넣는다
        // 배열 X-1부터 Y-1까지 Z로 덮어 쓴다.

        int[] N = new int[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            for (int b = x - 1; b <= y - 1; b++) {
                N[b] = z;
            }
        }

        for(int data: N) {
            System.out.print(data + " ");
        }

    }
}
