package Backjoon.St03LoopStatement;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Q05_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count = n / 4;

        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }

        System.out.println(sb + "int");
    }
}
