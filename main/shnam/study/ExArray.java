package main.shnam.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExArray {

    public static void main(String[] args) {
        new ExArray().solution();
    }

    public void solution() {
        소수_개수_구하기(); //(에라토스테네스)

        숫자_뒤집기();

        상하좌우_좌표();

        slidingWindow();

        twoPointerAlgorithm();

        리스트_배열_정렬();

        연속부분수열();
    }

    private void 소수_개수_구하기() {
        int n = 100;
        int cnt = 0;
        int ch[] = new int[n+1];

        for (int i = 2; i <= n; n++) {
            if (ch[i] == 0) {
                cnt++;
                for (int j=i; j <= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        System.out.println("cnt = " + cnt);
    }

    private void 소수_판별() {
        int n = 7;
        boolean isPrime = true;

        if (n == 1) isPrime = false;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                isPrime = false;
            }
        }
        System.out.println("isPrime = " + isPrime);
    }

    private void 숫자_뒤집기() {
        int n = 12345;
        int reversNumber = 0;

        while (n != 0) {
            int tmp = n%10;
            reversNumber = reversNumber * 10 + tmp;
            n = n/10;
        }
        System.out.println("reversNumber = " + reversNumber);
    }

    private void 상하좌우_좌표() {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if (nx >= 0 && nx < row && ny >=0 && ny < col) {
                        arr[nx][ny] = 0;
                    }
                }
            }
        }
        System.out.println(Integer.MAX_VALUE);

        System.out.println("arr = " + Arrays.deepToString(arr));
    }

    private void twoPointerAlgorithm() {
        int p1 = 0, p2 = 0;
        int n = 5, m = 8;
        int[] arr1 = {1, 3, 7, 9, 11};
        int[] arr2 = {2, 4, 5, 6, 8, 9, 10, 13};

        List<Integer> list = new ArrayList<>();

        while (p1 < n && p2 < m) {
            if (arr1[p1] > arr2[p2]) list.add(arr2[p2++]);
            else list.add(arr1[p1++]);
        }

        while (p1 < n) list.add(arr1[p1++]);
        while (p2 < m) list.add(arr2[p2++]);

        System.out.println("list = " + list);
    }

    private void 리스트_배열_정렬() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);

        Collections.sort(list);

        System.out.println("list = " + list);

        int[] arr = {3,5,1};

        Arrays.sort(arr);

        System.out.println("arr = " + Arrays.toString(arr));
    }

    private void slidingWindow() {
        int answer = 0, sum = 0;
        int k = 3, n = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 2, 3, 1, 1};

        for (int i = 0; i < k; i++) sum += arr[i];

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        System.out.println("slidingWindow answer = " + answer);
    }

    //Two Pointers Algorithm
    private void 연속부분수열() {
        int answer = 0, sum = 0, lt = 0;
        int n = 9, m = 6;
        int[] arr = {1, 2, 3, 1, 1, 2, 3, 4, 1};

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        System.out.println("answer = " + answer);
    }
}
