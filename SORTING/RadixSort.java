package SORTING;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        short arr [] ={3,9,3,4,6,10};
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);

        short temp[] =new short[max+1];
        for (int i=0; i<arr.length; i++)
                temp[arr[i]]++;
        int k=0;
        for (int i=0; i<=max;i++)
        {
            if(temp[i]>0)
            {
                arr[k++]=(short)i;
                temp[i]--;
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
