package SEARCHING;
import java.util.*;

public class SearchInInfiniteSizedArray {
    static int InfiniteSearch(int[] arr, int key) {
        int start = 0;
        int end = 1;
        while (key > arr[end]) {
            int x = start;
            start = end + 1;
            int len = end - x;
            end = (len * 2) + end;
        }
        return binarySearch(arr, start, end, key);
    }

    static int binarySearch(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int maxSize = 1000000;
        int[] arr = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            arr[i] = rand.nextInt(Integer.MAX_VALUE); // Generate random numbers up to 10 million
        }
        Arrays.sort(arr); // Sorting the array for binary search to work correctly
        int key = Math.abs(rand.nextInt());// Generate a random key to search for
        int res = InfiniteSearch(arr,key);
        System.out.println("Key: " + key + ", Found at index: " + res);
    }
}