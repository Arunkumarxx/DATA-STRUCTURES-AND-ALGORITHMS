package ARRAYS;/*
Given an array arr[] of size N-1 with integers in the range of [1, N],
the task is to find the missing number from the first N integers.
Note: There are no duplicates in the list.
Examples:
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
 */

 class FindTheMissingNumber {

      static int missing(int arr[],int n){

           int sum  =(n*(n+1))/2;

           int actualSum=0;

           for (int temp:arr){

                actualSum +=temp;

           }

           return sum-actualSum;

      }

      public static void main(String[] args) {

           int arr[]= {1,2,4,6,3,7,8,};

           int n=8;

           int result = missing(arr,n);

           System.out.println(result);

      }

}
