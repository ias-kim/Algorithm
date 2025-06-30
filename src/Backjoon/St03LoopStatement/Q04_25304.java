package Backjoon.St03LoopStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q04_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            totalPrice -= a * b;
        }
        br.close();

        if (totalPrice == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
