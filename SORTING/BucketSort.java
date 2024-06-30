package SORTING;

import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        float [] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 23.32f};
        int nbksBuckets= arr.length;
        Map<Integer, List<Float>> BucketSort = new HashMap<>();
        for (int i=0;i< arr.length;i++)
            BucketSort.put(i,new LinkedList<>());
        System.out.println(BucketSort);
    }
}
