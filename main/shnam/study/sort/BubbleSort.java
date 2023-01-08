package main.shnam.study.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 1, 3, 4};

        BubbleSort bubble = new BubbleSort();
        bubble.sort(arr);
    }

    private void sort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
