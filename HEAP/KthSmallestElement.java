package HEAP;

public class KthSmallestElement {

    public static void main(String[] args) {

    }
    public static int kthSmallest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> maxHeap =new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0;i<k;++i)
        {
            maxHeap.add(arr[i]);
        }
        for(int i=k;i<n;++i)
        {
            if(arr[i]<maxHeap.peek())
            {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.poll();
    }
}

