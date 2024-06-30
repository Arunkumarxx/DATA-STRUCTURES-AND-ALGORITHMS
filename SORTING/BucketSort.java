package SORTING;

import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        float [] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.32f,0.590f};
        int nbksBuckets= arr.length;
        HashMap<Integer, List<Float>> BucketSort = new HashMap<>();

        for (int i=0;i< arr.length;i++)
            BucketSort.put(i,new LinkedList<>());

        for (int i=0; i< arr.length;i++)
            BucketSort.get((int)(arr[i]*nbksBuckets)).add(arr[i]);

        for (int i=0;i< nbksBuckets;i++)
            Collections.sort(BucketSort.get(i));
        int ind=0;
        for (int i=0;i<BucketSort.size();i++)
        {
            for (float x:BucketSort.get(i))
                arr[ind++]=x;
        }
        for (float x:arr)
            System.out.print(x);
    }
}
