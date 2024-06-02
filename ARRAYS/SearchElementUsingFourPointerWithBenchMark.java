package ARRAYS;

public class SearchElementUsingFourPointerWithBenchMark {

    static int QuickSearch(int[] arr, int key, int n) {
        if (n < 4) {
            for (int i = 0; i < n; i++)
                if (arr[i] == key)
                    return i;
        }

        int left = 0; // 0
        int leftHalf = (n - 1) / 4; // 25
        int mid = (n - 1) / 2; // 50
        int right = n - 1; // 99
        int rightHalf = ((n - 1) / 2) + ((n - 1) / 4); // 75
        int breakLeft = (n - 1) / 4;
        int breakRight = ((n - 1) / 2) + ((n - 1) / 4);
        while (left < breakLeft && leftHalf < mid && rightHalf > mid && right > breakRight) {
            if (arr[left] == key)
                return left;
            if (arr[leftHalf] == key)
                return leftHalf;
            if (arr[right] == key)
                return right;
            if (arr[rightHalf] == key)
                return rightHalf;
            left++;
            leftHalf++;
            rightHalf--;
            right--;
        }
        return -1;
    }

    static int LinearSearch(int[] arr, int key, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int TwoPointerSearch(int[] arr, int key, int n) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (arr[left] == key)
                return left;
            if (arr[right] == key)
                return right;
            left++;
            right--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        int key = arr[96788];

        long startTime = System.nanoTime();
        int linearInd = LinearSearch(arr, key, arr.length);
        long endTime = System.nanoTime();
        long linearDuration = (endTime - startTime) / 1000;

        startTime = System.nanoTime();
        int twoPointerInd = TwoPointerSearch(arr, key, arr.length);
        endTime = System.nanoTime();
        long twoPointerDuration = (endTime - startTime) / 1000;

        startTime = System.nanoTime();
        int quickInd = QuickSearch(arr, key, arr.length);
        endTime = System.nanoTime();
        long quickDuration = (endTime - startTime) / 1000; // Convert to microseconds

        if (linearInd != -1)
            System.out.println("Linear Search: Element found at index: " + linearInd);
        else
            System.out.println("Linear Search: Not found");

        if (twoPointerInd != -1)
            System.out.println("Two Pointer Search: Element found at index: " + twoPointerInd);
        else
            System.out.println("Two Pointer Search: Not found");

        if (quickInd != -1)
            System.out.println("Quick Search: Element found at index: " + quickInd);
        else
            System.out.println("Quick Search: Not found");

        System.out.println("Linear Search execution time: " + linearDuration + " microseconds");
        System.out.println("Two Pointer Search execution time: " + twoPointerDuration + " microseconds");
        System.out.println("Quick Search execution time: " + quickDuration + " microseconds");
    }
}
