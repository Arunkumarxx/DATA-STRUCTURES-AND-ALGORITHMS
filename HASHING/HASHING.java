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
        int  endOne =((n / 2));
        int  startTwo =(n / 2)+1;
        int  endTwo = ((n)-1);
//        System.out.println(startOne);
//        System.out.println(endOne);
//        System.out.println(startTwo);
//        System.out.println(endTwo);
        int sum = 0;
        System.out.println();

        int itr=0;
        while (startOne < endOne && startTwo < endTwo) {
            sum += (arr[++startOne] + arr[--endOne] + arr[++startTwo] + arr[--endTwo]);
            itr++;
        }
        while(startOne<endOne)
                sum+=arr[++startOne]+arr[--endOne];

        while(startTwo<endTwo)
                sum+=arr[++startTwo]+arr[--endTwo];
        System.out.println(sum);
    }
}
