package HASHING;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int [] arr ={2,6,1,2,2,4};
        HashSet <Integer> hashSet = new HashSet<>();
        for (int x:arr)
            hashSet.add(x);
        System.out.println(hashSet);
    }
}