package RECURSION;

import java.util.Scanner;

class MeanOfArrayUsingRecursion {
    static int sum=0;

    static  int  meanRecursion(int[] arr,int n) {
        if (n==0){
            return 1;
        }
        meanRecursion(arr,n-1);
        sum+=arr[n-1];
        return sum/arr.length;
    }
     public static void main(String[] args) {
         int [] arr = {1,2,3,4,5};
         int res=  meanRecursion(arr,arr.length);
         System.out.println(res);
     }
}
