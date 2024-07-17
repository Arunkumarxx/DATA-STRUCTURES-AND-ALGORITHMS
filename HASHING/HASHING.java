package HASHING;

public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int n = arr.length;
        int res = 0;

        for (int i = 0; i < arr.length; ++i)
            arr[i] = 1;

        for (int i = 0; i < n; i++)
            res += arr[i];
        System.out.println("Total Sum: " + res);

        int startOne = 0;
        int endOne = (n / 2) - 1;
        int startTwo = n / 2;
        int endTwo = n - 1;

        int sum = 0;

        while (startOne <= endOne && startTwo <= endTwo) {
            sum += (arr[startOne++] + arr[endOne--] + arr[startTwo++] + arr[endTwo--]);
        }

        while (startOne <= endOne) {
            sum += arr[startOne++] + arr[endOne--];
        }

        while (startTwo <= endTwo) {
            sum += arr[startTwo++] + arr[endTwo--];
        }

        System.out.println("Segment Sum: " + sum);
    }
}
