package SORTING;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] arr) {
        int n = arr.length;

        if (n <= 0) return;

        // Create empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort individual buckets using insertion sort
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 23.32f};

        System.out.println("Array before sorting:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("\nArray after Bucket Sort:");
        printArray(arr);
    }

    public static void printArray(float[] arr) {
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
