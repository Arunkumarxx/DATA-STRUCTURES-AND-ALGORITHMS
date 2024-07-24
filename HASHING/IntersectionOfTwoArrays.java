package HASHING;

import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
       int [] arr1 ={10,15,20,25,30,50};
       int [] arr2 ={30,5,15,80};
       int n1=arr1.length;
       int n2= arr2.length;
       NbrOfIntersection(arr1,arr2,n1,n2);
    }
    private static int NbrOfIntersection(int arr1[], int arr2[], int n1, int n2) {
        HashMap<Integer,Integer> freq =new HashMap<>();

        int i=0 ,j=0;
        while(i<n1 && j<n2)
        {
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            freq.put(arr2[j],freq.getOrDefault(arr2[j],0)+1);
            ++i;
            ++j;
        }
        while(i<n1) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
            ++i;
        }

        while(j<n2) {
            freq.put(arr2[j], freq.getOrDefault(arr2[j], 0) + 1);
            ++j;
        }
        System.out.println(freq);
         i=0;
         j=0;
         int count=0;
        while(i<n1 && j<n2)
        {
            if(freq.get(arr1[i])==2)
                ++count;
            if(freq.get(arr2[j])==2)
                ++count;
            ++i;
            ++j;
        }
        while(i<n1) {
            if(freq.get(arr1[i])==2)
                ++count;
            ++i;
        }

        while(j<n2) {
            if(freq.get(arr2[j])==2)
                ++count;
            ++j;
        }
        return count;
    }
}
