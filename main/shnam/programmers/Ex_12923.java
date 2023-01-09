package main.shnam.programmers;

import java.util.Arrays;

public class Ex_12923 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12923

    public static void main(String[] args) {
        Ex_12923 ex_12900 = new Ex_12923();

        int begin = 5;
        int end = 6;

        System.out.println(Arrays.toString(ex_12900.solution(begin, end)));
    }

    public int[] solution(long begin, long end) {
        int grepLength = (int)(end - begin) + 1;
        int blockCnt = grepLength / 2;

        int[] answer = new int[grepLength];

        for (int i = (int)begin; i <= blockCnt; i++) {
            int cnt = 3;
            for (int j = 2*i; j <= grepLength; ) {
                answer[j-1] = i;
                if (i == 1) {
                    j++;
                } else {
                    j = cnt*i;
                }
                cnt++;
            }
        }
        return answer;
    }
}
