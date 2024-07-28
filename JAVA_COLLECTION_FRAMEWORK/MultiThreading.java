package JAVA_COLLECTION_FRAMEWORK;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class MultiThreadingPerformance {

    public static void main(String[] args) throws InterruptedException {
        Random random =new Random();
        int n=Integer.MAX_VALUE/2;
        int [] arr =new int[n];
        for (int i=0; i<n; ++i)
            arr[i]+=random.nextInt(1,10);

        // Measure time for multithreading execution
        long startTimeMultithreading = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new OperationTask(arr, '+'));
        executor.submit(new OperationTask(arr, '-'));
        executor.submit(new OperationTask(arr, '/'));
        executor.submit(new OperationTask(arr, '*'));

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to complete
        }
        long endTimeMultithreading = System.currentTimeMillis();
        System.out.println("Multithreading execution time: " + (endTimeMultithreading - startTimeMultithreading) + "ms");

        // Measure time for sequential execution
        long startTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential Result +: " + performOperation(arr, '+'));
        System.out.println("Sequential Result -: " + performOperation(arr, '-'));
        System.out.println("Sequential Result /: " + performOperation(arr, '/'));
        System.out.println("Sequential Result *: " + performOperation(arr, '*'));
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("Sequential execution time: " + (endTimeSequential - startTimeSequential) + "ms");
    }

    private static int performOperation(int[] arr, char operation) {
        int result = (operation == '*' || operation == '/') ? 1 : arr[0];

        switch (operation) {
            case '+':
                for (int num : arr) {
                    result += num;
                }
                break;
            case '-':
                for (int i = 1; i < arr.length; i++) {
                    result -= arr[i];
                }
                break;
            case '/':
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        result /= arr[i];
                    } else {
                        System.out.println("Division by zero encountered!");
                        return 0;
                    }
                }
                break;
            case '*':
                for (int num : arr) {
                    result *= num;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
        return result;
    }

    static class OperationTask implements Runnable {
        private final int[] arr;
        private final char operation;

        OperationTask(int[] arr, char operation) {
            this.arr = arr;
            this.operation = operation;
        }

        @Override
        public void run() {
            System.out.println("Result for " + operation + ": " + performOperation(arr, operation) + " - " + Thread.currentThread().getName());
        }
    }
}
/*
PC CPU  AMD RYZEN 7 5800X  8 CORE 16 THREADS

Result for +: 1073842430 - pool-1-thread-1
Result for -: -1073842409 - pool-1-thread-2
Result for *: 0 - pool-1-thread-4
Result for /: 0 - pool-1-thread-3

Multithreading execution time: 2109ms
Sequential Result +: 1073842430
Sequential Result -: -1073842409
Sequential Result /: 0
Sequential Result *: 0

Sequential execution time: 3269ms
 */