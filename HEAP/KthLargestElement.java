package HEAP;

public class KthLargestElement {


    public static int KthLargest(int arr[], int k)
    {
        int n = arr.length;
        for (int i = n/2-1; i >= 0; --i) {
            heapify(arr, n, i);
        }
        for (int i = n-1; i > n-k-1; --i) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr[n-k];
    }

    private static void heapify(int[] arr, int n, int i)
    {
        while (true) {
            int largest = i;
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if (leftChild < n && arr[leftChild] > arr[largest])
                largest = leftChild;
            if (rightChild < n && arr[rightChild] > arr[largest])
                largest = rightChild;
            if (largest == i)
                return;
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            i = largest;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Kth largest element is: " + KthLargest(arr, k));
    }
}
