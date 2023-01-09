package main.shnam.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Ex_12953 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12953

    public static void main(String[] args) {
        Ex_12953 ex_12953 = new Ex_12953();

        int[] arr = {2,6,8,14};

        System.out.println(ex_12953.solution(arr));
    }

    public int solution(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length-1; i++) {
            int first = arr[i];
            int second = arr[i+1];

            for (int j = 1; j <= first && j <= second; j++) {
                if (first%j == 0 && second%j == 0) {
                    max = j;
                }
            }
            arr[i+1] = arr[i] * arr[i+1] / max;
        }

        String[] strArray = "".split("},");
        strArray = Arrays.stream(strArray).sorted(Comparator.comparing(String::length)).toArray(String[]::new);

        String num = "2";
        int convert = Integer.valueOf(num);

        return arr[arr.length-1];
    }
}
