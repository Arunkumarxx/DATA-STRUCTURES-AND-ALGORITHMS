package HEAP;

public class KthLargestElementInStream {
    private void kthLargest(int arr[], int n, int k){
        // Your code here\
        PriorityQueue<Integer> minHeap =new PriorityQueue<Integer>();
        for(int i=0;i<n;++i)
        {
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

    }

}
