package com.kuldeep.dsa.sorting;

import com.google.common.base.Stopwatch;

import static com.kuldeep.utils.KdUtils.printArray;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class SortDemo {

    public static void main(String[] args) {

        System.out.println("Welcome to sorting algorithms...");
        int arr[] = {64,25,12,22,11};
        sort(arr, new SelectionSort());
        sort(arr, new BubbleSort());
    }

    static void sort(int arr[], KdSort sortAlgo) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        System.out.println();
        System.out.println(sortAlgo.getClass().getSimpleName() + " ...");
        System.out.print("Before sort = ");
        printArray(arr);

        sortAlgo.sort(arr);

        System.out.print("After sort = ");
        printArray(arr);
        System.out.println("time: " + stopwatch.elapsed(MILLISECONDS));
    }
}
