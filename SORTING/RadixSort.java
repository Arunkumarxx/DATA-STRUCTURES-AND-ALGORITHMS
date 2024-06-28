package SORTING;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

    }
}





/*
first  needed to learn counting sort then learn radix sort

  short arr [] ={3,9,3,4,6,10};
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);

        short temp[] =new short[max+1];
        for (int i=0; i<arr.length; i++)
                temp[arr[i]]++;
        System.out.println(Arrays.toString(temp));
        int k=0;
        for (int i=0; i< temp.length;)
        {
            if(temp[i]>0)
            {
                arr[k++]=(short)(i);
                temp[i]--;
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
 */