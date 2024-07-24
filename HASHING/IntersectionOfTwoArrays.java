package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
       int [] arr1 ={10,15,20,25,30,50};
       int [] arr2 ={30,5,15,80};
       int n=arr1.length;
       int m= arr2.length;
        HashSet<Integer> set =new HashSet<Integer>();
        int i=0,j=n-1;
        while (i<j) {
            set.add(arr1[i]);
            set.add(arr2[j]);
            ++i;
            --j;
        }
    }
}
