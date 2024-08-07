package HASHING;

import java.util.HashSet;

public class HashingForPairTwo {
    public static void main(String[] args) {
        int[] arr =
    {73, 23, 39, 93, 39, 80, 91, 58, 59, 92, 16, 89, 57, 12, 3, 35, 73, 56, 29};
        int target=47;
        int n= arr.length;
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<String> VisitedPairs = new HashSet<>();
        int count=0;
       for (int i=0; i<n; ++i)
       {
           int pair= target-arr[i];
           if(hashSet.contains(pair))
           {
               String Pairs=Math.min(arr[i],pair)+","+Math.max(arr[i],pair);
               if(!(VisitedPairs.contains(Pairs))) {
                   VisitedPairs.add(Pairs);
                   ++count;
               }
           }
           if(count>=2)
           {
               System.out.println(true);
               break;
           }
           hashSet.add(arr[i]);

       }
    }

}