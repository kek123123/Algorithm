package main.shnam.baekjoon;

import java.util.Scanner;

public class Ex_11726 {

    // 문제 출처 : https://www.acmicpc.net/problem/11726

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = ( dp[i-1] + dp[i-2] ) % 10007;
        }

        System.out.println(dp[N]);
    }
}
