package SORTING;

public class UnionOfTwoSortedArray {

    public static void main(String[] args) {
        int [] arr1 =  new int[] {1, 2, 3, 4, 5}   ;
        int [] arr2 =new int[]{1, 2, 3, 6, 7};
        int [] ans = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int len1=arr1.length;
        int len2=arr2.length;
        int k=0;
        while(i<len1 && j<len2)
        {
            if(i>0 && arr1[i]==arr1[i-1]) {
                i++;
                continue;
            }
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j])
                ans[k++]=arr1[i++];
            else if(arr1[i]>arr2[j])
                ans[k++]=arr2[j++];
            else {
                ans[k++]=arr1[i];
                i++;
                j++;
            }
        }
        while (i < len1) {
            if (i == 0 || arr1[i] != arr1[i - 1])
                ans[k++] = arr1[i];
            i++;
        }
        while (j < len2) {
            if (j == 0 || arr2[j] != arr2[j - 1])
                ans[k++] = arr2[j];
            j++;
        }
        for (int s:ans) System.out.print(s+" ");
    }
}
