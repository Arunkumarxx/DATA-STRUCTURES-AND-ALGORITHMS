package SORTING;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int   [][] arr = {{2, 6}, {8, 10}, {15, 18}};
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int ind=0;
        ArrayList<int []> arrayList =new ArrayList<>();
        while(ind< arr.length)
        {
            int star=arr[ind][0];
            int end=arr[ind][1];
            while(ind < arr.length-1 && end>=arr[ind+1][0]){
                end=Math.max(end,arr[ind+1][1]);
                ind++;
            }
            arrayList.add(new int[]{star,end});
            ind++;
        }

    }
}
