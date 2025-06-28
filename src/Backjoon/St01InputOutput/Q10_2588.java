package Backjoon.St01InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Q10_2588 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        String b = sc.next();
//
//        sc.close();
//
//        System.out.println(a * (b.charAt(2) - '0'));
//        System.out.println(a * (b.charAt(1) - '0'));
//        System.out.println(a * (b.charAt(0) - '0'));
//        System.out.println(a * Integer.parseInt(b));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        char[] b = B.toCharArray();

        System.out.println(A * (b[2] - '0'));
        System.out.println(A * (b[1] - '0'));
        System.out.println(A * (b[0] - '0'));
        System.out.println(A * Integer.parseInt(B));
    }
}
