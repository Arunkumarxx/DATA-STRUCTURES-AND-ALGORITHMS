package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
       int [] arr1 ={10,15,20,25,30,50};
       int [] arr2 ={30,5,15,80};
       int n=arr1.length;
       int m= arr2.length;
      int res= NumberofElementsInIntersection(arr1,arr2,n,m);
        System.out.println(res);
    }
    public static int NumberofElementsInIntersection(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set =new HashSet<Integer>();
        int i=0,j=n-1;
        while (i<j) {
            set.add(arr1[i]);
            set.add(arr1[j]);
            ++i;
            --j;
        }
        if(i==j)set.add(arr1[i]);
        i=0;
        j=m-1;
        HashSet<Integer> intersection =new HashSet<>();
        while(i<j)
        {
            if(set.contains(arr2[i])) intersection.add(arr2[i]);
            if(set.contains(arr2[j]))  intersection.add(arr2[j]);
            ++i;
            --j;
        }
        if(i==j &&  set.contains(arr2[i])) intersection.add(arr2[i]);
        return intersection.size();
    }
}
