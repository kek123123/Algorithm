package main.shnam.programmers;

public class Ex_12914 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12914

    public static void main(String[] args) {
        Ex_12914 ex_12914 = new Ex_12914();
        System.out.println("ex_12914 = " + ex_12914.solution(3));
    }

    public long solution(int n) {

        long dp[] = new long[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }

        return dp[n];
    }
}
