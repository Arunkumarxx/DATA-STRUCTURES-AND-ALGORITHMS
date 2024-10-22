package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class KthLargestElements {
    private int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer val : arr) {
            maxHeap.add(val);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        KthLargestElements obj = new KthLargestElements();
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int[] result = obj.kLargest(arr, arr.length, k);
        System.out.println("K largest elements: " + Arrays.toString(result));
    }
}
