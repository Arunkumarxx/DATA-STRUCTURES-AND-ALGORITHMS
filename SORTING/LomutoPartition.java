package SORTING;

public class LomutoPartition {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Selecting the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // A utility function to print the array
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test partition algorithm
    public static void main(String[] args) {
        int[] arr = {36,34,43,11,15,20,28,45,27,32};
        int n = arr.length;
        int pivotIndex = partition(arr, 0, n - 1);
        System.out.println("Pivot element: " + arr[pivotIndex]);
        System.out.println("Partitioned array:");
        printArray(arr);
    }
}
