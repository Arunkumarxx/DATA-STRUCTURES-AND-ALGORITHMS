package RECURSION;

class PrintFibonacciSeriesInReverseOrderUsingRecursion {
    static int FibonacciSeriesUsingRecursion(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return FibonacciSeriesUsingRecursion(n - 2) + FibonacciSeriesUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(FibonacciSeriesUsingRecursion(i) + " ");
        }
    }
}
