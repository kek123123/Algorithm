package main.shnam.study.combAndPermutation;

import java.util.Arrays;

public class Combination {

    public static void main(String[] args) {
        Combination combination = new Combination();

        int n = 4;
        int r = 2;
        int[] arr = {1, 2, 3, 5};
        boolean[] visited = new boolean[n];
        int start = 0;

        combination.backTracking(arr, visited, start, n, r);
        combination.dfs(arr, visited, start, n, r);
    }

    public void backTracking(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            backTracking(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public void dfs(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        dfs(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        dfs(arr, visited, depth + 1, n, r);
    }
}
