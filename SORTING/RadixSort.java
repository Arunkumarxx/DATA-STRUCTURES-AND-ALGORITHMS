
package SORTING;

import java.util.Arrays;
/*
first we needed to learn counting sort then learn radix sort
 */
public class RadixSort {

    public static void main(String[] args) {
        int [] arr ={432,8,530,90,88,231,11,45,677,199};
        int [] result =new int[arr.length];
        // get max element
        int max=Integer.MIN_VALUE;
        for (int x:arr)
            max=Math.max(x,max);
        int pos=1;
        while(max/pos >0){
            int [] count = new int[10];
            for (int i=0; i<arr.length; i++)
                ++count[(arr[i]/pos)%10];
            for (int i=1; i<count.length; i++)
            {
                count[i]+=count[i-1];
            }
            for (int i=arr.length-1; i>=0; i--)
            {
                int ind=(arr[i]/pos)%10;
                int countInd=--count[ind];
                result[countInd]=arr[i];
            }
            for(int i=0;i< arr.length;i++)
                arr[i]=result[i];
            pos*=10;
        }
        System.out.println(Arrays.toString(result));


        System.out.println("Arun kumar");
        System.out.println("Arunxx");
    }
}


