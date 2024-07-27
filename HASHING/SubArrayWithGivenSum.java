package HASHING;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {


    public static void main (String[] args)
    {
        int [] arr = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));

    }

    static boolean isSum(int arr[], int n, int target)
    {
        Set<Integer> hashSet = new HashSet<Integer>();
        int sum = 0;
        int itr=0;
        for(int i = 0; i < n; i++)
        {
//            itr++;
            sum += arr[i];
            if(sum==target)
                return true;
            if(hashSet.contains(sum-target) == true) {
                System.out.println(hashSet);
                return true;

            }

            hashSet.add(sum);
        }
        return false;
    }

}
