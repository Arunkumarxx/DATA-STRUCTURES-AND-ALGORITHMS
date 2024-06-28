package SORTING;

public class RadixSort {
    public static void main(String[] args) {
        short arr [] ={3,9,3,4,6,10};
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);

        short temp[] =new short[max+1];
        for (int i=0; i<max; i++)
                temp[arr[i]]++;
        
    }
}
