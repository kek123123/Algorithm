package main.shnam.study.dfs;


public class ExDfs5 {
    
    // 7 * 7 격자판 미로를 탈출하는 경로의 가지수를 출력
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

        System.out.println(new ExDfs5().solution(map, start, end));
    }

    int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int targetX;
    int targetY;
    int n;
    int answer;
    boolean[][] visited;

    public int solution(int[][] map, int[] start, int[] end) {
        targetX = end[0];
        targetY = end[1];
        n = map.length;
        visited = new boolean[n][n];

        visited[start[0]][start[1]] = true;
        dfs(start[0], start[1], map);

        return answer;
    }

    private void dfs(int row, int col, int[][] map) {

        if (targetX == row && targetY == col) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nr = row + D[i][0];
                int nc = col + D[i][1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                if (visited[nr][nc]) continue;
                if (map[nr][nc] == 1) continue;

                visited[nr][nc] = true;
                dfs(nr, nc, map);
                visited[nr][nc] = false;
            }
        }
    }
}
