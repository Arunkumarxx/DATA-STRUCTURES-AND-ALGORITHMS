package HEAP;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;

public class MergeKSortedArray {

    private static ArrayList<Integer> mergeKArrays(int[][] arr,int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<k;++i) {
            for(int j=0;j<k;++j) {
                minHeap.add(arr[i][j]);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int size=minHeap.size();
        for(int i=0;i<size;++i) {
            res.add(minHeap.poll());
        }
        minHeap.clear();
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5}, {2, 4, 6}, {0, 8, 9}};
        int k = 3;
        System.out.println("Merged array: " + Arrays.toString(mergeKArrays(arr, k).toArray()));
    }
}
