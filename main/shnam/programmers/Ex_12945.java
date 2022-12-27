package main.shnam.programmers;

public class Ex_12945 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12945

    public static void main(String[] args) {
        Ex_12945 ex_12945 = new Ex_12945();

        System.out.println("ex_12945.solution = " + ex_12945.solution(100000));
    }

    public int solution(int n) {
        long[] dp = new long[n+1];

        dp[0] = 0L;
        dp[1] = 1L;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return (int) dp[n] % 1234567;
    }
}
