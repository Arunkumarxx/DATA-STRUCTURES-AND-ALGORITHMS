package HASHING;

import java.util.HashMap;

public class SubarraysWithEqual1sAnd0s {

    public static void main(String[] args) {
        int [] arr ={1,0,0,1,0,1,1};
        int n= arr.length;
        int count=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int sum=0;
        hashMap.put(0,1);
        for (int i=0; i<n;++i)
        {
            sum=arr[i]==0?sum-1:sum+1;
            if(hashMap.containsKey(sum))
                count+=hashMap.get(sum);

                hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
            }
        System.out.println(count);
    }

}
/*
Subarrays with equal 1s and 0s
Difficulty: MediumAccuracy: 57.47%Submissions: 53K+Points: 4
Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.

Example 1:

Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4),
(4, 5) ,(2, 5), (0, 5), (1, 6)
Example 2:

Input:
n = 5
A[] = {1,1,1,1,0}
Output: 1
Explanation: The index range for the
subarray is (3,4).
Your Task:
You don't need to read input or print anything. Your task is to complete the function countSubarrWithEqualZeroAndOne() which takes the array arr[] and the size of the array as inputs and returns the number of subarrays with equal number of 0s and 1s.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 106
0 <= A[i] <= 1
 */