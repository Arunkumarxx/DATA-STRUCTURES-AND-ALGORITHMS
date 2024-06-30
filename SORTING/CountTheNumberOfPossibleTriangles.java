package SORTING;

import java.util.Arrays;

public class CountTheNumberOfPossibleTriangles {
    public static void main(String[] args) {
        int [] arr ={6, 4, 9, 7, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n= arr.length;
        int count=0;
        for (int c=n-1; c>=2;c--)
        {
            int a=0;
            int b=c-1;
            while(a<b)
            {
                if(arr[a]+arr[b]>arr[c]) {
                    count += b - a;
                    --b;
                }
                else ++a;
            }

        }
        System.out.println(count);
    }
}