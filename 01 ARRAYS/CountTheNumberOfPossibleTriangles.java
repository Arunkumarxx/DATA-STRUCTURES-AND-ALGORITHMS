package ARRAYS;

import java.util.Arrays;
class CountTheNumberOfPossibleTriangles {
     static void CountNumberOfPossibleTriangles1(int[] arr,int n) {
          int count =0;
          for (int i=0; i<n;i++){
               for (int j=i+1; j<n;j++){
                    for (int k=j+1;k<n; k++){
                         if (arr[i]+arr[j]>arr[k])
                              count++;
                         // O(n^3)
                         // O(1)
                    }
               }
          }
          System.out.println(count);
     }
    static void CountTheNumberOfPossibleTriangles2(int[] arr,int n){
         Arrays.sort(arr);
         //3,4,6,7
        int count=0;
        for (int i=0; i<n-2; ++i){
            int k=i+2;
            for (int j=i+1; j<n-1; ++j){
                while (k<n && arr[i]+arr[j]>arr[k]) {
                    k++;
                }
                count++;
            }
        }
        System.out.println(count);

     }
     public static void main(String[] args) {
     int [] arr =  {4,6,3};
     //             3 4 6 7
         //         0 1 2 3
     int n= arr.length;

     CountTheNumberOfPossibleTriangles2(arr,n);
     }
}
