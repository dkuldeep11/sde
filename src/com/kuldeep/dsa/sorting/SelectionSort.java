package com.kuldeep.dsa.sorting;

/**
 * Time Complexity: O(n2) as there are two nested loops.
 *
 * Auxiliary Space: O(1)
 The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
 */
public class SelectionSort implements KdSort {

    @Override
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
