package SORTING;

import java.util.Arrays;


public class CountingSort {
    static void countSort(int [] arr,int n) {
        int max=0;
        for (int x:arr)
           max= Math.max(max,x);
        int [] freq= new int[max+1];

        for (int i=0; i<=max; i++)
            freq[arr[i]]++;
        int k=0;
        for (int i=0; i<=max; )
        {
            if(freq[i]>0)
            {
                arr[k++]=i;
                freq[i]--;
            }else  i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr  ={5,3,2,1,2,5};
        int n= arr.length;
        countSort(arr,n);
    }

}
