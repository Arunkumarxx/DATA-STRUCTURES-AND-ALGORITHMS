package SORTING;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0};
        int N = arr.length;
        int left = 0;
        int right = N - 1;
        while (left < right) {
            while (left < right && arr[left] == 0)
                left++;
            while (left < right && arr[right] == 1)
                right--;
            if (left < right) {
                int x = arr[left];
                arr[left] = arr[right];
                arr[right] = x;
                left++;
                right--;
            }
        }
        for (int x : arr)
            System.out.print(x+" ");
    }
}
