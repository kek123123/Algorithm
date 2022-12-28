package main.shnam.programmers;

import java.util.Arrays;

public class Ex_87390 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/87390

    public static void main(String[] args) {
        Ex_87390 ex_87390 = new Ex_87390();

        int n = 3;
        int left = 2;
        int right = 5;

        System.out.println(Arrays.toString(ex_87390.solution(n, left, right)));
    }

    public int[] solution(int n, long left, long right) {
        long[] result = new long[(int)(right - left + 1)];
        int idx = 0;

        for (long i = left; i <= right; i ++) {
            result[idx++] = Math.max(i % n + 1, i / n + 1);
        }

        return Arrays.stream(result).mapToInt(i -> (int)i).toArray();
    }
}
