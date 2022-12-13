package main.shnam.baekjoon;

public class Ex_9095 {

    // 문제 출처 : https://www.acmicpc.net/problem/9095

    public static void main(String[] args) {

        int n = 10;

        solution(n);
    }

    public static void solution(int n) {

        int[] arr = new int[n+1];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        System.out.println("result = " + arr[n]);
    }
}
