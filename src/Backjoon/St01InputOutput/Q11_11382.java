package Backjoon.St01InputOutput;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Q11_11382 {
    public static void main(String[] args) throws IOException {
        // 한 줄의 입력을 버퍼로 읽고, 공백으로 구분하여 문자열 배열 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data[] = br.readLine().split(" ");

        // 문자열 long 타입으로 변환하기 위해 Long.parseLong() 메서드 사용
        long a = Long.parseLong(data[0]);
        long b = Long.parseLong(data[1]);
        long c = Long.parseLong(data[2]);

        System.out.println(a + b + c);
    }
}
