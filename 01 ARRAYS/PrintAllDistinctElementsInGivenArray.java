package ARRAYS;

import java.util.Arrays;

class PrintAllDistinctElementsInGivenArray {
    static void PrintAllDistinctElementsInGivenArray1(int[] arr,int n) {
        // brute force 1:
        for (int i=0; i<n; i++){
            boolean isUnique = true;
            for (int j=0; j<i; j++){
                if (arr[j]==arr[i]){
                    isUnique=false;
                }
            }
            if (isUnique){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void PrintAllDistinctElementsInGivenArray2(int[] arr,int n) {
        // brute force 2:
        Arrays.sort(arr);
        //4, 4, 5, 6, 6, 9, 10, 10, 120
        for (int i =0; i<n; i++){
            while ( i<n-1&& arr[i]==arr[i+1]){
                i++;
            }
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr  ={10, 5, 3, 4, 3, 5, 6};
        int n= arr.length;
        PrintAllDistinctElementsInGivenArray1(arr,n);
        System.out.println();
        PrintAllDistinctElementsInGivenArray2(arr,n);
    }
}
