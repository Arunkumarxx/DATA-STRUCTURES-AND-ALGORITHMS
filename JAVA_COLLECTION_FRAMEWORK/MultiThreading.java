package JAVA_COLLECTION_FRAMEWORK;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class MultiThreadingOptimized {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Create a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new OperationTask(arr, '+'));
        executor.submit(new OperationTask(arr, '-'));
        executor.submit(new OperationTask(arr, '/'));
        executor.submit(new OperationTask(arr, '*'));

        // Shut down the executor service
        executor.shutdown();
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

        private int performOperation(int[] arr, char operation) {
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
    }
}
