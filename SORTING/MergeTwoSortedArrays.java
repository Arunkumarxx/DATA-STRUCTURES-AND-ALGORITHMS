package SORTING;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        long [] arr1 = {1,3,5,7};
        long  [] arr2 = {0,2,6,8,9};
        int len1=arr1.length;
        int len2=arr2.length;
        long  [] arr3= new long [len1+len2];
        int len3=arr3.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k++]=arr1[i++];
            }
            else {
                arr3[k++]=arr2[j++];
            }
        }
        while(i<len1)
        {
            arr3[k++]=arr1[i++];
        }
        while(j<len2)
        {
            arr3[k++]=arr2[j++];
        }
        for (long  x:arr3) System.out.print(x+" ");
    }
}