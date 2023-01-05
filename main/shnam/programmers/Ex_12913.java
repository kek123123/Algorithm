package main.shnam.programmers;

public class Ex_12913 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12913

    public static void main(String[] args) {
        Ex_12913 ex_12913 = new Ex_12913();

        //int[][] land = {{4,3,2,1}, {2,2,2,1}, {6,6,6,4}, {8,7,6,5}};
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        System.out.println(ex_12913.solution(land));
    }

    int solution(int[][] land) {

        int answer = 0;
        int row = land.length;
        int col = land[0].length;

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                findMaxNumber(land, dp, i, j);
            }
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, dp[row-1][i]);
        }

        return answer;
    }

    private void findMaxNumber(int[][] land, int[][] dp, int row, int col) {

        if (row > 0) {
            int prevMaxNumber = 0;
            for (int i = 0; i < 4; i++) {
                if (i != col) {
                    prevMaxNumber = Math.max(prevMaxNumber, dp[row-1][i]);
                }
            }
            int currNumber = land[row][col] + prevMaxNumber;
            dp[row][col] = currNumber;
        } else {
            dp[row][col] = land[row][col];
        }
    }
}
