package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = arr.length;
        int res=0;
        int count=1;
        for (int i = 0; i < arr.length; ++i)
            arr[i]=count;

        for (int i = 0; i < n; i++)
            res += arr[i];
        System.out.println(res);
        int  startOne = (0);
        int  endOne =(((n-1)/ 2)-1);
        int  startTwo =((n-1)/ 2);
        int  endTwo = ((n)-1);
        int sum = 0;
        System.out.println();

        int itr=0;
        while (startOne < endOne && startTwo < endTwo) {
            sum += (arr[++startOne] + arr[--endOne] + arr[++startTwo] + arr[--endTwo]);
        }
        while(startOne<endOne)
                sum+=arr[++startOne]+arr[--endOne];

        while(startTwo<endTwo)
                sum+=arr[++startTwo]+arr[--endTwo];
    }
}
