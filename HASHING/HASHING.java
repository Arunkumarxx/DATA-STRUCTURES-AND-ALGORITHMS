package HASHING;

public class HASHING {
    private static long sumUsingSingleLoop(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to sum elements using two-pointer approach
    private static long sumUsingTwoPointer(int[] arr) {
        long sum = 0;
        int left = 0, right = arr.length - 1;

        while (left <right) {
          sum+=arr[left]+arr[right];
          ++left;
          --right;
        }
        if(left==right)
            sum+=arr[left];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000000];
        // Populate arr with test data
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // Measure time for single loop approach
        long startTimeSingleLoop = System.currentTimeMillis();
        long sumSingleLoop = sumUsingSingleLoop(arr);
        long endTimeSingleLoop = System.currentTimeMillis();

        // Measure time for two-pointer approach
        long startTimeTwoPointer = System.currentTimeMillis();
        long sumTwoPointer = sumUsingTwoPointer(arr);
        long endTimeTwoPointer = System.currentTimeMillis();

        // Print results
        System.out.println("Sum using single loop: " + sumSingleLoop);
        System.out.println("Time taken using single loop: " + (endTimeSingleLoop - startTimeSingleLoop) + " ms");
        System.out.println("Sum using two-pointer: " + sumTwoPointer);
        System.out.println("Time taken using two-pointer: " + (endTimeTwoPointer - startTimeTwoPointer) + " ms");
    }
}