package HASHING;

import java.util.HashMap;

public class SortAnArrayAccordingToTheOther {
    public static void main(String[] args) {
        int [] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int [] arr2 = {2,1,8,3};
        int n1= arr1.length;
        int n2= arr2.length;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i=0; i<n2; ++i)
        hashMap.put(arr2[i],0);
        int i=0,j=n1-1;

        while(i<j )
        {
            if(hashMap.containsKey(arr1[i]))
        }
    }
}
