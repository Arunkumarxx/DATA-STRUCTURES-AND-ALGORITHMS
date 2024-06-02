package ARRAYS;

class countTheZeros {
         static int countZeros(int arr[],int n) {
             int l=0,r=n-1;
             int count=0;
             while (l<=r){
                 int m = l+(r-l)/2;
                 if (arr[m]==1){
                     l=m+1;
                 }
                 else{
                     count=n-m;
                     r=m-1;
                 }
             }
             return count;
         }
         public static void main(String[] args) {
             int arr[]  ={1,1,1,1,1,1,1,1,1,1,0,0,0,0};
             int n= arr.length;
             int result =countZeros(arr,n);
             System.out.println(result);
         }
     }

