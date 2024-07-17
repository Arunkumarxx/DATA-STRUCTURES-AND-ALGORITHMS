package HASHING;

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

        int left=0;
        int leftBreak=((n-1)/100)*25;
        int leftMid=leftBreak+1;
        int mid=((n-1)/100)*50;
        int rightMid=((n-1)/100)*75;
        int right=n-1;
        while(left<leftBreak && leftMid )
    }
}
