package SORTING;

import java.util.Arrays;

public class RadixSort {

    // Function to get the maximum value in the array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to perform counting sort on the array based on digit represented by exp
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] freq = new int[10]; // Frequency array to store count of digits (0 to 9)

        // Store count of occurrences of each digit in freq[]
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            freq[digit]++;
        }

        // Build the output array using the frequency array
        for (int i = 0, k = 0; i < 10; i++) {
            while (freq[i] > 0) {
                output[k++] = i;
                freq[i]--;
            }
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers according to current digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Function to perform Radix Sort
    public static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = getMax(arr);

        // Perform counting sort for every digit. Note that exp is 10^i where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Main method to test the radix sort
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array:");
        printArray(arr);
        radixSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}



/*
first  needed to learn counting sort then learn radix sort
 int temp[] = new int[arr.length];
        int max=arr[0];
        for (int x:arr)
            max=Math.max(max,x);
        int [] freq = new int[max+1];
        for (int i:arr)
            ++freq[i];
        for (int i=1; i< freq.length; i++)
            freq[i]+=freq[i-1];
        for (int i=arrN-1; i>=0; i--)
        {
            temp[freq[arr[i]]-1]=arr[i];
            --freq[arr[i]];
        }
        for (int i=0; i< temp.length; i++)
            arr[i]=temp[i];
        System.out.println(Arrays.toString(arr));

 */