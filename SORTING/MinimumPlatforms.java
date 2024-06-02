package SORTING;

import java.util.Arrays;

public class MinimumPlatforms {
    static int findPlatform(int start[], int stop[], int n)
    {
        Arrays.sort(start);
        Arrays.sort(stop);
        int j=0;
        int i=1;
        int res=1;
        int count=1;
        while(i<n && j<n)
        {
            if(start[i]<=stop[j])
            {
                i++;
                count++;
            }
            else {
                count--;
                j++;
            }
            res=Math.max(count,res);
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = {900, 940,950, 1100, 1500, 1800};
        int  dep[] = {910, 1200, 1120, 1130, 1900, 2000};
       int res= findPlatform(arr,dep, arr.length);
        System.out.println(res);
        System.out.println();

    }

}
