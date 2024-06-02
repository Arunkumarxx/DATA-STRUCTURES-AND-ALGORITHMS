package SEARCHING;

import java.util.ArrayList;

public class FindIndexesOfsubArrayWithSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> indexes = new ArrayList<>();
        int sum=0;
        int left=0;
        int right =0;
        if (s==0) {
            indexes.add(-1);
            return indexes;
        }
        while (right < n) {
            sum += arr[right];

            while (sum > s) {
                sum -= arr[left];
                left++;
            }

            if (sum == s) {
                indexes.add(left + 1); // Adjust for 1-based indexing
                indexes.add(right + 1); // Adjust for 1-based indexing
                return indexes;
            }

            right++;
        }

        indexes.add(-1);
        return indexes;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(subarraySum(arr, arr.length, 3));
    }
}
