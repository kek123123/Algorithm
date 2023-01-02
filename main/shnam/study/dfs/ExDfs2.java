package main.shnam.study.dfs;

import java.util.Arrays;

public class ExDfs2 {
    
    // 제한 시간 동안 풀 수 있는 최대 점수

    public static void main(String[] args) {

        int n = 5;
        int time = 20;
        int[][] examples = {{10, 5}, {25, 12}, {15, 8}, {6, 3}, {7, 4}};

        System.out.println(new ExDfs2().solution(n, time, examples));
    }

    int totalExampleCnt;
    int totalTime;
    int answer;

    private int solution(int n, int time, int[][] examples) {

        totalExampleCnt = n;
        totalTime = time;

        dfs(0, examples[0][0], examples[0][1], examples);

        return answer;
    }

    private void dfs(int idx, int sum, int time, int[][] examples) {

        if (time > totalTime) {
            return;
        } else if (idx == totalExampleCnt-1) {
            answer = Math.max(answer, sum);
            return;
        }

        dfs(idx+1, sum + examples[idx+1][0], time + examples[idx+1][1], examples);
        dfs(idx+1, sum, time, examples);
    }
}
