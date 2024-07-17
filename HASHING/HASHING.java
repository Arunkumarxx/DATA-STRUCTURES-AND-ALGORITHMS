package HASHING;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int n = arr.length;
        int res=0;
        int count=1;
        for (int i = 0; i < arr.length; ++i)
            arr[i]=count;

        for (int i = 0; i < n; i++)
            res += arr[i];
        System.out.println(res);
        System.out.println();
        int startOne=0;
        int endOne=(n-1)/2;
        int startTwo=(n+1)/2;
        int endTwo=n-1;

        System.out.println(startOne);
        System.out.println(endOne);
        System.out.println(startTwo);
        System.out.println(endTwo);
        int sum=0;
        while(startOne<endOne && startTwo<endTwo) {
            sum = sum+ arr[startOne] + arr[endOne] + arr[startTwo] + arr[endTwo];
            ++startOne;
            ++startTwo;
            --endOne;
            --endTwo;
        }

        System.out.println(sum);

    }
}
