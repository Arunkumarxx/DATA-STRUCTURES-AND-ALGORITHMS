package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[87];
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < arr.length; ++i)
            arr[i] += i + 1;

        for (int i = 0; i < n; i++)
            res += arr[i];
        System.out.println(res);
        float startOne = (0);
        float endOne = ((n / 2) - 1);
        float startTwo = ((n / 2));
        float endTwo = ((n - 1));
        System.out.println(startOne);
        System.out.println(endOne);
        System.out.println(startTwo);
        System.out.println(endTwo);
//        int sum = 0;
//
//        while (startOne < endOne && startTwo < endTwo) {
//            sum += (arr[startOne] + arr[endOne] + arr[startTwo] + arr[endTwo]);
//            ++startOne;
//            --endOne;
//            ++startTwo;
//            --endTwo;
//
//        }
//        System.out.println(sum);
//        System.out.println(res-sum);
    }
}
