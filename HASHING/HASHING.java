package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[13];
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < arr.length; ++i)
            arr[i] += i + 1;

        for (int i = 0; i < n; i++)
            res += arr[i];
        System.out.println(res);
        int  startOne = (0);
        int  endOne =(int)Math.ceil ((n / 2f) - 1);
        int  startTwo =(int)Math.ceil ((n / 2f));
        int  endTwo = ((n - 1));
//        System.out.println(startOne);
//        System.out.println(endOne);
//        System.out.println(startTwo);
//        System.out.println(endTwo);
        int sum = 0;

        while (startOne < endOne && startTwo < endTwo) {
            sum += (arr[startOne] + arr[endOne] + arr[startTwo] + arr[endTwo]);
            ++startOne;
            --endOne;
            ++startTwo;
            --endTwo;

        }
        System.out.println(sum);
    }
}
