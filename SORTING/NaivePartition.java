package SORTING;

import java.util.Random;

 class TestNaivePartition {
    public static void main(String[] args) {
        Random random = new Random();


        for (int testCase = 1; testCase <= 1112; testCase++) {

            int size = random.nextInt(16) + 5;
            int[] arr = new int[size];


            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(100);
            }

            int pivotIndex = random.nextInt(size);
            int pivot = arr[pivotIndex];


            System.out.println("Test Case " + testCase + ": Original Array with Pivot Element " + pivot);
            printArray(arr);

            partition(arr, pivotIndex);


            System.out.println("Partitioned Array:");
            printArray(arr);

            System.out.println();
        }
    }


    public static void partition(int[] arr, int pivotIndex) {
        int[] temp = new int[arr.length];
        int pivot = arr[pivotIndex];
        int k = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < pivot)
                temp[k++] = arr[i];

        temp[k] = pivot;
        k += 1;

        for (int j = 0; j < arr.length; j++)
            if (arr[j] > pivot)
                temp[k++] = arr[j];

        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
