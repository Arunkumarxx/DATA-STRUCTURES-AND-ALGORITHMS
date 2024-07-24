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
        for(int i=0; i<n; ++i)
            set.add(arr1[i]);
        HashSet<Integer> inter =new HashSet<Integer> ();
        int count=0;
        for(int i=0; i<m; ++i)
            if(set.contains(arr2[i]))
                inter.add(arr2[i]);
        System.out.println(count);
    }
}
