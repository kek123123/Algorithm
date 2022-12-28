package main.shnam.programmers;

public class Ex_12900 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12900

    public static void main(String[] args) {
        Ex_12900 ex_12900 = new Ex_12900();
        System.out.println(ex_12900.solution(5));
    }

    public static final int NUM = 1000000007;

    public int solution(int n) {
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] % NUM + dp[i-1] % NUM;
        }

        return dp[n] % NUM;
    }
}
