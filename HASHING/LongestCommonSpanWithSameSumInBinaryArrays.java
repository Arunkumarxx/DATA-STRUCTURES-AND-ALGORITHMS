package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n1 = arr1.length;
        int n2 = arr2.length;
        System.out.println(Optimal(arr1, arr2, n1, n2));
    }
    private static int Optimal(int[] arr1, int[] arr2, int n1, int n2) {
        int[] temp = new int[n1];
        int tn = temp.length;
        for (int i = 0; i < tn; ++i)
            temp[i] = arr1[i] - arr2[i];
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        for (int i = 0; i < tn; ++i) {
            sum += temp[i];
            if (sum == 0 || hashMap.containsKey(sum))
                if (i - hashMap.get(sum) > res)
                    res = Math.max(res, i - hashMap.get(sum));
            if (!hashMap.containsKey(sum))
                hashMap.put(sum, i);
        }
        System.out.println(Arrays.toString(temp));
        return res;
    }
}

