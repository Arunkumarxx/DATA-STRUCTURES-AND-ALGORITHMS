package JAVA_COLLECTION_FRAMEWORK;


  class multiThreading extends Thread {
    int[] arr;
    int n;
    char c;

    multiThreading(int[] arr, int n, char c) {
        this.arr = arr;
        this.n = n;
        this.c = c;
    }

    public void run() {
        System.out.println("Result for " + c + ": " + method(arr, c) + " - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        multiThreading T1 = new multiThreading(arr, n, '+');
        multiThreading T2 = new multiThreading(arr, n, '-');
        multiThreading T3 = new multiThreading(arr, n, '/');
        multiThreading T4 = new multiThreading(arr, n, '*');

        T1.start();  // Start thread T1
        T2.start();  // Start thread T2
        T3.start();  // Start thread T3
        T4.start();  // Start thread T4
    }

    private int method(int[] arr, char job) {
        int res = (job == '*' || job == '/') ? 1 : arr[0]; // Initialize based on operation
        if (job == '+') {
            for (int i = 0; i < arr.length; ++i) {
                res += arr[i];
            }
        } else if (job == '-') {
            for (int i = 1; i < arr.length; ++i) { // Start from the second element
                res -= arr[i];
            }
        } else if (job == '/') {
            for (int i = 1; i < arr.length; ++i) { // Start from the second element
                if (arr[i] != 0) { // Prevent division by zero
                    res /= arr[i];
                } else {
                    System.out.println("Division by zero encountered!");
                    return 0; // Return 0 or handle it according to your logic
                }
            }
        } else if (job == '*') {
            for (int i = 0; i < arr.length; ++i) {
                res *= arr[i];
            }
        }
        return res;
    }
}