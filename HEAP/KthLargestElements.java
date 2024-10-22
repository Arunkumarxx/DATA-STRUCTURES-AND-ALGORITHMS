package HEAP;

import java.util.PriorityQueue;
import java.util.Arrays;

public class KthLargestElements {
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<k;++i)
            minHeap.add(arr[i]);
        for(int i=k;i<n;++i) {
            if(arr[i]>minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        int[] result=new int[k];
        for(int i=0;i<k;++i) {
            result[i]=minHeap.poll();
        }
        int start=0;
        int end=result.length-1;
        while(start<end) {
            int temp=result[start];
            result[start]=result[end];
            result[end]=temp;
            ++start;
            --end;
        }
        return result;
    }

    public static void main(String[] args) {
        KthLargestElements obj=new KthLargestElements();
        int[] arr={3,2,1,5,6,4};
        int k=2;
        int[] result=obj.kLargest(arr,arr.length,k);
        System.out.println("K largest elements: "+Arrays.toString(result));
    }
}
