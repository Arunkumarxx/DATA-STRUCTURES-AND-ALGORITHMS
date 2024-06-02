package RECURSION;

import java.util.Arrays;

class RecursiveProgramsToFindMinimumAndMaximumElementsOfArray {

     static void RecursionFindMinAndMax(int arr[],int n) {
         if (arr.length-1==n-1)
             System.out.println("min =" + arr[n - 1]);

         if (n==0) {
             System.out.println("max =" + arr[0]);
             return;
         }
         RecursionFindMinAndMax(arr,n-1);
     }
     public static void main(String[] args) {
         int arr[]  ={1, 4, 3, -5, -4, 8, 6};
         int n= arr.length;
         Arrays.sort(arr);
         RecursionFindMinAndMax(arr, n);

     }

}
