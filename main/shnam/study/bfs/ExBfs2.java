package main.shnam.study.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ExBfs2 {

    // 7 * 7 격자판 미로를 탈출하는 최단 거리
    // 출발점은 (1, 1) 도착점은 (7, 7) 격자판의 1은 벽이고, 0은 통로이다.
    // 격자판의 움직임은 상하좌우로 이동

    public static void main(String[] args) {

        int[][] map = {{0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1, 1, 0},
                        {0, 0, 0, 1, 0, 0, 0},
                        {1, 1, 0, 1, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0, 1},
                        {1, 1, 0 ,1, 1, 0, 0},
                        {1, 0, 0, 0, 0 ,0, 0}};

        int[] start = {0, 0};
        int[] end = {6, 6};

        System.out.println(new ExBfs2().solution(map ,start, end));
    }

    class Point {
        int row, col, dist;

        Point (int r, int c, int d) {
            row = r;
            col = c;
            dist = d;
        }
    }

    int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int n;
    int answer = Integer.MAX_VALUE;
    int[][] map;
    int targetRow;
    int targetCol;

    public int solution(int[][] map, int[] start, int[] end) {

        int startRow = start[0];
        int startCol = start[1];
        targetRow = end[0];
        targetCol = end[1];
        n = map.length;
        this.map = map;

        map[startRow][startCol] = 1;
        bfs(startRow, startCol, 0);

        return answer;
    }

    private void bfs(int row, int col, int dist) {

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(row, col, dist));

        while (!queue.isEmpty()) {

            Point curr = queue.poll();

            if (targetRow == curr.row && targetCol == curr.col) {
                answer = Math.min(answer, curr.dist);
            }

            for (int i = 0; i < 4; i++) {
                int nx = curr.row + D[i][0];
                int ny = curr.col + D[i][1];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (map[nx][ny] == 1) continue;

                map[nx][ny] = 1;
                queue.add(new Point(nx, ny, curr.dist + 1));
            }
        }
    }
}
