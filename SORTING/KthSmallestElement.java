package SORTING;

class KthSmallestElement {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int l = low + 1;
        int r = high;

        while (l <= r) {
            while (l <= r && arr[l] < pivot)
                l++;
            while (l <= r && arr[r] > pivot)
                r--;
            if (l <= r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        swap(arr, low, r);
        return r;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int QuickSort(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int r = partition(arr, low, high);
            if (r == k - 1)
                return arr[r];
            else if (r > k - 1)
                return QuickSort(arr, low, r - 1, k);
            else
                return QuickSort(arr, r + 1, high, k);
        }
        return -1;
    }

    public static int kthSmallest(int arr[], int n, int k) {
        return QuickSort(arr, 0, arr.length - 1, k);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,9};
       int res= kthSmallest(arr, arr.length,3);
        System.out.println(res);
    }
}