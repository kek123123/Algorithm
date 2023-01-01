package main.shnam.study.dfs;

import java.util.*;

public class ExDfs {
    
    // 합이 같은 부분집합

    public static void main(String[] args) {

        int[] set = {1, 2, 3, 4, 5, 9};

        System.out.println(new ExDfs().solution(set));
    }

    boolean isSumEqual = false;
    int sum;
    int[] set;

    private String solution(int[] localSet) {

        set = localSet;
        sum = Arrays.stream(localSet).sum();

        dfs(0, localSet[0]);

        return isSumEqual ? "YES" : "NO";
    }

    private void dfs(int idx, int localSum) {

        System.out.println(localSum);

        if (isSumEqual || sum == 2 * localSum) {
            isSumEqual = true;
            return;
        } else if (idx == set.length -1 || sum < 2 * localSum) {
            isSumEqual = false;
            return;
        }

        dfs(idx+1, localSum + set[idx+1]);
        dfs(idx+1, localSum);
    }

    //1 2 3 4 5 9
}
