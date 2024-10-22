package HEAP;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    public long minCost(long[] arr) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (Long val : arr) {
            minHeap.add(val);
        }
        long totalCost = 0;
        while (minHeap.size() > 1) {
            long min1 = minHeap.poll();
            long min2 = minHeap.poll();
            long newRope = min1 + min2;
            totalCost += newRope;
            minHeap.add(newRope);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        MinimumCostOfRopes obj = new MinimumCostOfRopes();
        long[] ropes = {4, 3, 2, 6};
        System.out.println("Minimum cost to connect ropes: " + obj.minCost(ropes));
    }
}