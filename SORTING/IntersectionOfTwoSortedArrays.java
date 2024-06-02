package  SORTING;

import java.util.ArrayList;

class IntersectionOfTwoSortedArrays {
    static int  binarySearch(int arr[],int key) {
        int l =0;
        int  r = arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> lis = new ArrayList<Integer> ();

        int j=0;
        for (int i=0; i<nums1.length; i++)
        {
            if(i>0 && nums1[i]==nums1[i-1])
                continue;
            int ind= binarySearch(nums2,nums1[i]);
            if(ind==-1)
                continue;

            if(nums1[i]==nums2[ind])
                lis.add(nums1[i]);
        }
        int [] ans =  new int [lis.size()];
        for(int i=0; i<lis.size(); i++)
            ans[i]=lis.get(i);
        return ans;
    }

    public static void main(String[] args) {
        int nums1[] ={4,9,5};
        int nums2[]={9,4,9,8,4};
     for (int x: intersection(nums1,nums2))
        System.out.println(x +" ");
    }
}