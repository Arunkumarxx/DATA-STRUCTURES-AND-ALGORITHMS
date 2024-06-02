package ARRAYS;

class PrintLeftRotationOfArrayBigOofNInTimeAndSpaceBigOofOne {
     static void PrintLeftRotationOfArrayBigOofNInTimeAndSpaceBigOofOne1(int[] arr,int k , int n) {
          k %=n;
          for (int i =0;  i <n;  i++){
               System.out.print(arr[(i+k)%n]+" ");
          }
     }
     static  void PrintLeftRotationOfArrayBigOofNInTimeAndSpaceBigOofOne2(int[] arr,int k,int n) {
          k %= arr.length;
          reverse(arr,0,n-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);

          for (int temp:arr){
               System.out.print(temp+" ");
          }
     }
     static void reverse(int[] arr,int start,int end) {
          int temp;
          while (start<end){
               temp= arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
          }
     }

     public static void main(String[] args) {
          int [] arr = {1,3,5,7,9};
          int n= arr.length;
          PrintLeftRotationOfArrayBigOofNInTimeAndSpaceBigOofOne1(arr,14, arr.length);
          System.out.println("");
          PrintLeftRotationOfArrayBigOofNInTimeAndSpaceBigOofOne2(arr,14, arr.length);
     }
}
