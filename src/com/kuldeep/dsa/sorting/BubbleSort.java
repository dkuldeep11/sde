package com.kuldeep.dsa.sorting;

/**
 * The above function always runs O(n^2) time even if the array is sorted.
 * It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
 */
public class BubbleSort implements KdSort {

    @Override
    public void sort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swap = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }
}
