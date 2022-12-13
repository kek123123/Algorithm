package main.shnam.baekjoon;

import java.util.Scanner;

public class Ex_2579 {

    // 문제 출처 : https://www.acmicpc.net/problem/2579

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] stair = new int[301];
        int[] score = new int[301];
        for (int i = 1; i <= N; i++)
            stair[i] = sc.nextInt();

        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int i = 4; i <= N; i++) {
            score[i] = Math.max(score[i-3] + stair[i-1], score[i-2]) + stair[i];
        }

        System.out.println(score[N]);
    }
}