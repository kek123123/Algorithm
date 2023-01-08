package main.shnam.study.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 1, 3, 4};

        InsertionSort insertion = new InsertionSort();
        insertion.sort(arr);
    }

    private void sort(int[] arr) {

        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int tmp = arr[i], j;

            for (j = i-1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
