package main.shnam.programmers;

import java.util.Arrays;

public class Ex_87946 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/87946

    public static void main(String[] args) {
        Ex_87946 ex_87946 = new Ex_87946();

        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        System.out.println(ex_87946.solution(k, dungeons));
    }

    int dungeonSize;
    int answer;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        dungeonSize = dungeons.length;
        visited = new boolean[dungeonSize];

        dfs(dungeons, 0, k);

        return answer;
    }

    public void dfs(int[][] dungeons, int depth, int k) {

        for (int i = 0; i < dungeonSize; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(dungeons, depth + 1, k - dungeons[i][1]);
                visited[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }
}
