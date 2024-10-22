package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class KthLargestElements {

        int[] kLargest(int[] arr, int n, int k) {

            PriorityQueue<Integer> minHeap =new PriorityQueue<Integer>();

            for(int i=0; i<k;++i)
                minHeap.add(arr[i]);

            for(int i=k;i<n;++i)
            {
                if(arr[i]>minHeap.peek())
                {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
            }
            int [] result= new int [k];

            for(int i=0;i<k;++i)
            {
                result[i]=minHeap.poll();
            }
            int start=0;
            int end=result.length-1;
            while(start<end)
            {
                int temp=result[start];
                result[start]=result[end];
                result[end]=temp;
                ++start;
                --end;
            }
            return result;
        }
    }
