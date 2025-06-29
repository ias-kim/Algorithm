package Backjoon.St02ConditionalStatement;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        String c = (A > 0) ? "+" : "-";
        String d = (B > 0) ? "+" : "-";

        String result = c + d;

        switch (result) {
            case "++":
                System.out.println(1);
                break;
            case "-+":
                System.out.println(2);
                break;
            case "--":
                System.out.println(3);
                break;
            case "+-":
                System.out.println(4);
        }
    }
}
