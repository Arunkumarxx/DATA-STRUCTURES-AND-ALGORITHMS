package ARRAYS;

import java.util.Arrays;
class RearrangeArraySuchThatEvenPositionedAreGreaterThanOdd {
    static void RearrangeArraySuchThatEvenPositionedAreGreaterThanOdd1(int[] arr,int n ) {
        Arrays.sort(arr);
        //{1,1,2,2};
        int[] array = new  int[n];
        int smallest=0 , largest=n-1;
        for (int i=0; i <n; i++){
            if ((i+1)%2 == 0  ){
                array[i]=arr[largest];
                largest--;
            }
            else {
                array[i]=arr[smallest];
                smallest++;
            }
        }
        for (int temp:array){
            System.out.print(temp+" ");
        }
    }
    static void RearrangeArraySuchThatEvenPositionedAreGreaterThanOdd2(int[] arr,int n){

        for (int i=1; i<n; i++){
            if ( i%2 == 0){
                if (arr[i] > arr[i-1]){
                    int temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
            else {
                if (arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
        }
        for (int temp:arr){
            System.out.print(temp+" ");
        }
    }
    public static void main(String[] args) {
        int[]  arr = { 1, 2, 2, 1};
        RearrangeArraySuchThatEvenPositionedAreGreaterThanOdd1(arr, arr.length);
        System.out.println(" ");
        RearrangeArraySuchThatEvenPositionedAreGreaterThanOdd2(arr,arr.length);
    }
}
