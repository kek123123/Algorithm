package main.shnam.programmers;

import java.util.Arrays;

public class Ex_12936 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12936

    public static void main(String[] args) {
        Ex_12936 ex_12936 = new Ex_12936();

        int n = 4;
        int k = 7;

        int[] arr = new int[4];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        boolean[] visited = new boolean[n];

        ex_12936.combination(arr, visited, 0, n, 3);

        //System.out.println(Arrays.toString(ex_12936.solution(n, k)));
    }

    int idx;
    int totalCnt;
    int[] answer;
    boolean[] selected;
    boolean chkFlg;
    long target;

    int[] arrTmp;

    public int[] solution(int n, long k) {
        answer = new int[n];
        selected = new boolean[n];
        totalCnt = n;
        target = k;

        arrTmp = new int[n];
        for (int i = 0; i < n; i++) {
            arrTmp[i] = i+1;
        }

        dfs(0, new int[n]);

        return answer;
    }

    private void dfs(int depth, int[] arr) {

        if (chkFlg) return;

        if (depth == totalCnt) {
            System.out.println(Arrays.toString(arr));
            ++idx;
            return;
        }

        for (int i = 0; i < totalCnt; i++) {
            if (selected[i]) continue;

            selected[i] = true;
            arr[depth++] = arrTmp[i];
            dfs(depth, arr);
            depth--;
            selected[i] = false;

            if (target == idx) {
                answer = arr;
                chkFlg = true;
                return;
            }
        }
    }

    public void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    // 배열 출력
    private void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
