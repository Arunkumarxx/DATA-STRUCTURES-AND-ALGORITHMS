package HASHING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PositiveNegativePair {
    public static void main(String[] args) {
        int [] arr = {1,3,6,-2,-1,-3,2,7};
        int n= arr.length;
      HashSet<Integer> set =new HashSet<>();
      ArrayList<Integer> res =new ArrayList<>();
      for (int i=0; i<n; ++i)
      {
          int value=arr[i];
          int oppositeValue=-arr[i];
          if(set.contains(oppositeValue))
          {
              res.add(oppositeValue);
              res.add(value);
          }
          set.add(arr[i]);
      }
        System.out.println(res);
    }
}
