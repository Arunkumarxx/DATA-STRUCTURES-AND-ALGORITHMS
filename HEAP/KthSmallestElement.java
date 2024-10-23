package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement
{
    public static int kthSmallest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; ++i) {
            maxHeap.add(arr[i]);
        }
        for (int i = k; i < n; ++i) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.poll();
    }
    public static void main(String[] args)
    {
        KthSmallestElement obj = new KthSmallestElement();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest element is: " + obj.kthSmallest(arr, arr.length, k));
    }
}
