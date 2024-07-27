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

    static boolean isSum(int arr[], int n, int sum)
    {
        Set<Integer> s = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i = 0; i < n; i++)
        {
            pre_sum += arr[i];
            if(pre_sum==sum)
                return true;
            if(s.contains(pre_sum-sum) == true) {
                System.out.println(s);
                return true;

            }

            s.add(pre_sum);
        }
        return false;
    }

}
