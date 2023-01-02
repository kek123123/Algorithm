package main.shnam.study.dfs;

import java.util.Arrays;

public class ExDfs4 {
    
    // 가장 윗줄에 1부터 n까지의 숫자가 한 개 씩 있을 때, 둘째 줄부터 차례대로 삼각형처럼 위의 두개를 더한 값이 저장
    // n이 4이고 가장 윗 줄에 3 1 2 4 가 있으면 가장 아랫 줄은 16이 됨

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new ExDfs4().solution(4, 16)));
    }

    int[] b, p, ch;
    int n, f;
    int[][] dy = new int[35][35];
    boolean flag = false;

    public int[] solution(int n, int num) {

        this.n = n;
        this.f = num;

        b = new int[n];
        p = new int[n];
        ch = new int[n+1];

        for (int i = 0; i < n; i++) {
            b[i] = combi(n-1, i);
        }

        dfs(0, 0);

        return p;
    }

    private int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

    private void dfs(int idx, int sum) {

        if (flag) {
            return;
        }

        if (idx == n) {
            if (sum == f) {
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[idx] = i;
                    dfs(idx+1, sum + (p[idx] * b[idx]));
                    ch[i] = 0;
                }
            }
        }
    }
}
