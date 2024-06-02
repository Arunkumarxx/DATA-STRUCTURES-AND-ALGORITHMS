package ARRAYS;

public class QucikSearch {
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
        int count=0;
        while (left < breakLeft && leftHalf < mid && rightHalf > mid && right > breakRight) {
            count++;
            if (arr[left] == key) {
                System.out.println(count);
                return left;

            }
            if (arr[leftHalf] == key) {
                System.out.println(count);
                return leftHalf;
            }
            if (arr[right] == key) {
                System.out.println(count);
                return right;
            }
            if (arr[rightHalf] == key) {
                System.out.println(count);
                return rightHalf;
            }
            left++;
            leftHalf++;
            rightHalf--;
            right--;
        }
        System.out.println(count);
        return -1;

    }



    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        int key =1;

        long startTime = System.nanoTime();
        int quickInd = QuickSearch(arr, key, arr.length);
        long endTime = System.nanoTime();
        long quickDuration = (endTime - startTime) / 1000; // Convert to microseconds

        if (quickInd != -1)
            System.out.println("Quick Search: Element found at index: " + quickInd);
        else
            System.out.println("Quick Search: Not found");

        System.out.println("Quick Search execution time: " + quickDuration + " microseconds");
    }
}
