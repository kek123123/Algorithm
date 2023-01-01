package main.shnam.study.bfs;

import java.util.*;

public class ExBfs {
    
    // 1번 정점에서 6번 정점까지 가는 최소 거리

    public static void main(String[] args) {

        int[][] map = {{1, 4}, {1, 3}, {3, 4}, {2, 1}, {2, 5}, {4, 5}, {4, 6}, {6, 2}, {6, 5}};

        System.out.println(Arrays.toString(new ExBfs().solution(6, map)));
    }

    int n;
    int[] ch;
    int[] dist;
    List<List<Integer>> graph;

    private int[] solution(int n, int[][] map) {

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1];
        dist = new int[n+1];

        int row = map.length;

        for (int i = 0; i < row; i++) {
            int idx = map[i][0];
            int val = map[i][1];
            graph.get(idx).add(val);
        }

        bfs(1);

        return dist;
    }

    private void bfs(int v) {

        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dist[v] = 0;
        queue.add(v);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int i : graph.get(curr)) {
                if (ch[i] != 1) {
                    queue.add(i);
                    ch[i] = 1;
                    dist[i] = dist[curr] + 1;
                }
            }
        }
    }
}
