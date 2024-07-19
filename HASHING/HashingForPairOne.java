package HASHING;

import java.util.Arrays;

public class HashingForPairOne {


    private int[] PairCheckBruteForce(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int start = 0, end = n - 1;
        while (start < end) {
            if (target == (arr[start] + arr[end]))
                return new int[]{start + 1, end + 1};
            if ((arr[start] + arr[end]) < target)
                ++start;
            else --end;
        }
        return new int[]{};
    }
    private int [] PairCheckOptimized(int [] arr,int n,int target) {
        
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; ++i)
            arr[i] = i + 1;
        HashingForPairOne obj = new HashingForPairOne();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(obj.PairCheckBruteForce(arr, arr.length, 14)));
        System.out.println(Arrays.toString(obj.PairCheckOptimized(arr, arr.length,14)));

    }
}