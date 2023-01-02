package main.shnam.study.dfs;

public class ExDfs3 {
    
    // 거스름돈을 가장 적은 수의 동전으로 교환

    public static void main(String[] args) {

        int n = 15;
        int[] type = {1, 2, 5, 10};

        System.out.println(new ExDfs3().solution(n, type));
    }

    int totalSum;
    int totalLength;
    int answer = Integer.MAX_VALUE;

    private int solution(int n, int[] type) {

        totalSum = n;
        totalLength = type.length;

        dfs(0, 0, type);

        return answer;
    }

    private void dfs(int idx, int sum, int[] type) {

        if (sum == totalSum) {
            answer = Math.min(answer, idx);
            return;
        } else if (sum > totalSum) {
            return;
        } else if (idx >= answer) {
            return;
        } else {
            for (int i = 0; i < totalLength; i++) {
                dfs(idx+1, sum + type[i], type);
            }
        }
    }
}
