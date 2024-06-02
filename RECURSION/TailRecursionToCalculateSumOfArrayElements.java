package RECURSION;
 class TailRecursionToCalculateSumOfArrayElements {
     static void TailRecursionToSumOfArray(int arr[],int n,int sum) {
         if (n==0) {
             System.out.println(sum);
             return;
         }
         TailRecursionToSumOfArray(arr,n-1,sum+=arr[n-1]);
     }
     public static void main(String[] args) {
         int arr[] ={2,55,1,7};
         int n= arr.length;
         TailRecursionToSumOfArray(arr,n,0);
     }
}