package HASHING;

import ARRAYS.CheckIfArrayIsSortedAndRotated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int [] arr ={ 1,2,1,3,4,2,3};
        System.out.println(count(arr, arr.length,4));
    }
    private static ArrayList<Integer> count(int [] arr,int n,int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x:arr)
            hashSet.add(x);

        for(int i=0; i<k; ++k)
        {
            hashSet.add(arr[k]);
        }
        return new ArrayList<>();
    }
}