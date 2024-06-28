package ARRAYS;

import java.util.Arrays;

/*
Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
Examples :
Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23
 */
class FindTheLargestThreeDistinctElementsArray {
    static void largesThreeElements1(int[] arr) {
        int x, first,second,third;
        // first  =-  second = -  third  = -
        first=second=third=Integer.MIN_VALUE;

        for ( x=0; x < arr.length; x++){
            if (arr[x]>first) {
                third=second;
                second=first;
                first=arr[x];
            }
            else if (arr[x]>second && arr[x]!=first){
                third=second;
                second=arr[x];
            }
            else if (arr[x]> third && arr[x]!=second){
                third = arr[x];
            }
        }
         /*
        time complexity O(n);
        space complexity O(1)
         */
        System.out.println("Three largest Elements are "+first+" "+second+" "+third);
    }
    static void largestThreeElements2(int[] arr) {
        // using sort method and find duplicate then print it
        Arrays.sort(arr);
        int n=arr.length;
        int checkElement=Integer.MIN_VALUE ;
        int count=1;
        for (int i=1; i<=n; i++){

            if (count <4){
                if (checkElement != arr[n-i]){
                    System.out.print(arr[n-i]+" ");
                    checkElement=arr[n-i];
                    count++;
                }
            }
            else {
                break;
            }
        }
    }
    static void largestThreeElements3(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        System.out.println("first  ="+arr[n-1]);
        System.out.println("second ="+arr[n-2]);
        System.out.println("third  ="+arr[n-3]);
    }
    public static void main(String[] args) {
        int arr[] = {  10, 4, 3, 50, 23, 90 };
        largesThreeElements1(arr);
        System.out.println();
        largestThreeElements2(arr);
        System.out.println("\n");
        //-10 -1 0 1 5 12 23 45 45 54
        largestThreeElements3(arr);
    }
}
