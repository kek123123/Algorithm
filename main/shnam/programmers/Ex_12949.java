package main.shnam.programmers;

import java.util.Arrays;

public class Ex_12949 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12949

    public static void main(String[] args) {
        Ex_12949 ex_12949 = new Ex_12949();

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        System.out.println("ex_12949 = " + Arrays.deepToString(ex_12949.solution(arr1, arr2)));
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1Row = arr1.length;
        int arr1Col = arr1[0].length;
        int arr2Row = arr2.length;
        int arr2Col = arr2[0].length;

        int[][] answer = new int[arr1Row][arr2Col];

        for (int i = 0; i < arr1Row; i++) {
            for (int j = 0; j < arr1Col; j++) {
                for (int h = 0; h < arr2Col; h++) {
                    for (int k = 0; k < arr2Row; k++) {
                        answer[i][h] += arr1[i][j] * arr2[k][h];
                    }
                }
            }
        }

        return answer;
    }
}
