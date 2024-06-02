package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class   FindSecondLargestElementInAnArray {
    static void findSecondLargestElement1(int[] arr) {

        if (arr.length <2){
            System.out.println("invalid input");
        }
        else {
            Arrays.sort(arr);
            System.out.println("The second largest element  is " + arr[arr.length - 2]);
        }
    }
    static void findSecondLargestElement2(int[] arr) {

        int first,second;
        first=second=Integer.MIN_VALUE;
        int n= arr.length;
        if (arr.length <2){
            System.out.println("invalid input");
        }
        else {
            for (int i = 0; i < n; i++) {
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }
            System.out.println("The second largest element  is " + first);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,23,23,1212121};
        findSecondLargestElement2(arr);
    }
}
