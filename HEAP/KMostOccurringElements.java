package HEAP;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Collections;

public class KMostOccurringElements {
    int kMostFrequent(int arr[],int n,int k) {
        HashMap<Integer,Integer> hashMap=new HashMap();
        for(int val:arr) {
            if(hashMap.containsKey(val)) {
                hashMap.put(val,hashMap.getOrDefault(val,0)+1);
            } else {
                hashMap.put(val,1);
            }
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(Integer val:hashMap.values()) {
            maxHeap.add(val);
        }
        int sum=0;
        for(int i=0;i<k;++i) {
            sum+=maxHeap.poll();
        }
        return sum;
    }

    public static void main(String[] args) {
        KMostOccurringElements obj=new KMostOccurringElements();
        int[] arr={1,1,1,2,2,3};
        int k=2;
        System.out.println("Sum of frequencies of " + k + " most occurring elements: " + obj.kMostFrequent(arr,arr.length,k));
    }
}
