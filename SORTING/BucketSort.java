package SORTING;

import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        float [] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.32f};
        int nbksBuckets= arr.length;
        Map<Integer, List<Float>> BucketSort = new HashMap<>();
        for (int i=0;i< arr.length;i++)
            BucketSort.put(i,new LinkedList<>());
        for (int i=0; i< arr.length;i++)
            BucketSort.get((int)arr[i]*nbksBuckets).add(arr[i]);

        System.out.println(BucketSort);
    }
}
