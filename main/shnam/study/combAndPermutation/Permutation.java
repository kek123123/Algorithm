package main.shnam.study.combAndPermutation;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        Permutation permutation = new Permutation();

        int n = 4;
        int r = 2;
        int[] arr = {1, 2, 3, 5};
        int depth = 0;

        permutation.permutation1(arr, depth, n, r);

        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        permutation.permutation2(arr, output, visited, depth, n, r);
    }

    public void permutation1(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation1(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    private void swap(int[] arr, int depth, int i) {
        int tmp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = tmp;
    }

    public void permutation2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation2(arr, output, visited, depth + 1, n, r);
                visited[i] = false;;
            }
        }
    }
}
