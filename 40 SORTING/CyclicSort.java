package SORTING;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) throws Exception {
        int[] arr = {532, 8, 3, 234, 532, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < ele && j < i) {
                    count++;
                }
            }
            int x = arr[i];
            arr[i] = arr[count];
            arr[count] = x;
        }
        System.out.println(Arrays.toString(arr));
    }
}
