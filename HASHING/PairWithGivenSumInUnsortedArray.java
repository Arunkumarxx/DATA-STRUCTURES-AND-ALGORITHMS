package HASHING;

import java.util.HashSet;

public class PairWithGivenSumInUnsortedArray {
    public static void main(String[] args) {
        int [] arr ={3,2,8,15,-8};
        HashSet<Integer> set = new HashSet<>();
        int n= arr.length;
        int sum=17;
        boolean isPairFound=false;
        for (int i=0; i<n && isPairFound==false;++i)
        {
            if(set.contains(sum-arr[i]))
                isPairFound=true;
            set.add(arr[i]);
        }
        System.out.println(isPairFound?"Yes Pair found":"No Pair found");
    }
}
