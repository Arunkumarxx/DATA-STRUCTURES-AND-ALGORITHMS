package SORTING_ALGORITHM_COMPARSION;

import java.util.Arrays;

public class AlgorithmComparison {
    public static void main(String args[]) {

        int size = Integer.MAX_VALUE/2;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        System.out.println("Array length = " + size);
        System.out.println("\nElements randomly distributed : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ms)\tMemory Used(MB)");
        compareSortingAlgorithms(arr);

        System.out.println("\nElements already sorted : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ms)\tMemory Used(MB)");
        Arrays.sort(arr);
        compareSortingAlgorithms(arr);

        System.out.println("\nElements sorted in reverse order : ");
        System.out.println("\nSorting Algorithm\tTime Taken(ms)\tMemory Used(MB)");
        for (int i = 0; i <= arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = t;
        }
        compareSortingAlgorithms(arr);
    }

    private static void compareSortingAlgorithms(int arr[]) {
        printSortingTimeAndSpace(SortType.BUBBLE, arr);
        printSortingTimeAndSpace(SortType.BITONIC, arr);
        printSortingTimeAndSpace(SortType.COMB, arr);
        printSortingTimeAndSpace(SortType.HEAP, arr);
        printSortingTimeAndSpace(SortType.INSERTION, arr);
        printSortingTimeAndSpace(SortType.MERGE, arr);
        printSortingTimeAndSpace(SortType.QUICK, arr);
        printSortingTimeAndSpace(SortType.SELECTION, arr);
        printSortingTimeAndSpace(SortType.CYCLE, arr);
        printSortingTimeAndSpace(SortType.SHELL, arr);
        printSortingTimeAndSpace(SortType.INTRO, arr);
        printSortingTimeAndSpace(SortType.GNOME, arr);
    }

    private static void printSortingTimeAndSpace(SortType sortType, int[] arr) {

        int arr2[] = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();

        long startTime = System.nanoTime();

        // Perform sorting
        switch (sortType) {
            case BUBBLE:
                BubbleSort.bubbleSort(arr2);
                break;
            case BITONIC:
                BitonicSort.bitonicSort(arr2, 0, arr2.length, 1);
                break;
            case COMB:
                CombSort.combSort(arr2);
                break;
            case HEAP:
                HeapSort.heapSort(arr2);
                break;
            case INSERTION:
                InsertionSort.insertionSort(arr2);
                break;
            case MERGE:
                MergeSort.mergeSort(arr2, 0, arr2.length - 1);
                break;
            case QUICK:
                QuickSort.quickSort(arr2, 0, arr2.length - 1);
                break;
            case SELECTION:
                SelectionSort.selectionSort(arr2);
                break;
            case CYCLE:
                CycleSort.cycleSort(arr2, 0);
                break;
            case SHELL:
                ShellSort.shellSort(arr2);
                break;
            case INTRO:
                IntroSort.introSort(arr2, 0, arr2.length - 1, IntroSort.calcDepth(arr2));
                break;
            case GNOME:
                GnomeSort.gnomeSort(arr2);
                break;
        }

        long endTime = System.nanoTime();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();

        long memoryUsed = usedMemoryAfter - usedMemoryBefore;
        double memoryUsedMB = memoryUsed / (1024.0 * 1024.0);  // Convert bytes to MB
        double durationMs = (endTime - startTime) / 1_000_000.0;  // Convert nanoseconds to milliseconds

        System.out.printf("%-17s %15.3f ms %15.4f MB%n", sortType + "_SORT", durationMs, memoryUsedMB);
    }
}
