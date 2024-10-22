package HEAP;

public class KthLargestElements {

    public static void main(String[] args) {

    }
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> maxHeap =new PriorityQueue(Collections.reverseOrder());
        for(Integer val:arr)
        {
            maxHeap.add(val);
        }
        int [] result =new int[k];
        for(int i=0;i<k;++i)
        {
            result[i]=maxHeap.poll();
        }
        return result;
    }
}
