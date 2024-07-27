package HASHING;


import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {


    public static void main (String[] args)
    {
        int [] arr = new int[] {10,2,-2,-20,10};
        int sum=-10;
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
            if(s.contains(pre_sum-sum) == true)
                return true;

            s.add(pre_sum);
        }

        return false;
    }

}
