package SORTING;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int arr [] ={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);
        int [] freq = new int[max+1];
        for (int i:arr)
            ++freq[i];
        for (int i=0; i< freq.length; i++)
            freq[i]+=freq[i-1];
        
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