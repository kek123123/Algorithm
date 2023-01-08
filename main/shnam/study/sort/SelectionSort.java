package main.shnam.study.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 1, 3, 4};

        SelectionSort selection = new SelectionSort();
        selection.sort(arr);
    }

    private void sort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length-1; i++) {
            int idx = i;

            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
