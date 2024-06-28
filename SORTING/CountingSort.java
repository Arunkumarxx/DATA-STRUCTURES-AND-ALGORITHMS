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
    static void countingSortTwo() {
        int arr [] ={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        int temp[] = new int[arr.length];
        int arrN= arr.length;
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);
        int [] freq = new int[max+1];
        for (int i:arr)
            ++freq[i];
        for (int i=1; i< freq.length; i++)
            freq[i]+=freq[i-1];
        for (int i=arrN-1; i>=0; i--)
        {
            temp[freq[arr[i]]-1]=arr[i];
            --freq[arr[i]];
        }
        for (int i=0; i< temp.length; i++)
            arr[i]=temp[i];
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr  ={5,3,2,1,2,5};
        int n= arr.length;
        countSort(arr,n);
        countingSortTwo();
    }

}
