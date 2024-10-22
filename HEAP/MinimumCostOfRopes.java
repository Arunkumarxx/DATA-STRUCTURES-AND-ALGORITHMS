package HEAP;

public class MinimumCostOfRopes {

    public static void main(String[] args) {

    }
    public long minCost(long[] arr) {
        PriorityQueue<Long> minHeap =new PriorityQueue();

        for(Long val:arr)
        {
            minHeap.add(val);
        }
        long totalCost=0;

        while(minHeap.size()>1)
        {
            long min1=minHeap.poll();
            long min2=minHeap.poll();

            long newRope= min1+min2;

            totalCost+=newRope;

            minHeap.add(newRope);
        }
        return totalCost;
    }
}
