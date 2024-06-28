package SORTING;

public class RadixSort {
    public static void main(String[] args) {

    }
}





/*
first  needed to learn counting sort then learn radix sort
 int temp[] = new int[arr.length];
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

 */