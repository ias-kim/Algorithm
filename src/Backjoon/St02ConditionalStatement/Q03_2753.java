package Backjoon.St02ConditionalStatement;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        String result = ((A % 4 == 0 && A % 100 != 0) || A % 400 == 0) ? "1" : "0";

        System.out.println(result);
    }
}
