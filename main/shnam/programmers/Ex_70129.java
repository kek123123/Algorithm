package main.shnam.programmers;

import java.util.Arrays;

public class Ex_70129 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/70129

    public static void main(String[] args) {
        Ex_70129 ex_70129 = new Ex_70129();

        System.out.println(Arrays.toString(ex_70129.solution("110010101001")));
    }

    public int[] solution(String s) {

        int strSize = s.length();
        int removedZeroCnt = 0;
        int transferCnt = 0;

        while (strSize > 1) {
            s = s.replaceAll("0", "");
            removedZeroCnt += strSize - s.length();

            s = Integer.toBinaryString(s.length());
            transferCnt++;
            strSize = s.length();
        }

        return new int[] {transferCnt, removedZeroCnt};
    }
}
