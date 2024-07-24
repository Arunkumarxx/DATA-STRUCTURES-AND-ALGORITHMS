package HASHING;

import java.util.HashSet;

public class PairWithGivenSumInUnsortedArray {
    public static void main(String[] args) {
        int [] arr ={3,2,8,15,-8};
        HashSet<Integer> set = new HashSet<>();
        int n= arr.length;
        int sum=17;
        for (int i=0; i<n;++i)
        {
            if(set.contains(sum-arr[i]))
            {
                System.out.println(true);
                break;
            }
            set.add(arr[i]);
        }

    }
}
