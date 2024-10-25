package HEAP;

import java.util.PriorityQueue;

public class KthLargestElementInStream {
    private void kthLargest(int arr[], int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < n; ++i) {
            minHeap.add(arr[i]);
            if (minHeap.size() > k)
                minHeap.poll();
            if (minHeap.size() < k)
                System.out.print("-1 ");
            else
                System.out.print(minHeap.peek() + " ");
        }
    }
    public static void main(String[] args) {
        KthLargestElementInStream obj = new KthLargestElementInStream();
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        obj.kthLargest(arr, arr.length, k);
    }
}
