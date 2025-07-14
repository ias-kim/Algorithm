package Backjoon.St04Array;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Q06_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 1 ~ N 번호
        int[] arr = new int[N];
        // M번 공 바꿈
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int before = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = before;
        }
         for (int num : arr) {
             System.out.print(num + " ");
         }


    }
}
