package SEARCHING;
public class SmallestMissingPositive {
    static int missingNumber(int arr[], int size) {
        int n=size;

        for (int i=0; i<n;i++) {
                while( arr[i] > 0 && arr[i] <=n && arr[i]!=arr[arr[i]-1]) {
                    int x = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = x;
            }
        }
        for (int i=0; i<n;i++)
            if (arr[i]!=i+1)
                return i+1;
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-1,1};
        int n = arr.length;
        int res = missingNumber(arr, n);
        System.out.println(res);
    }
}