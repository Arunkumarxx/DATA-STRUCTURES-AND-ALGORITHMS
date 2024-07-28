class MultiThreadingPerformance {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5};

        // Measure time for multithreading execution
        long startTimeMultithreading = System.currentTimeMillis();
        multiThreading T1 = new multiThreading(arr, '+');
        multiThreading T2 = new multiThreading(arr, '-');
        multiThreading T3 = new multiThreading(arr, '/');
        multiThreading T4 = new multiThreading(arr, '*');

        T1.start();
        T2.start();
        T3.start();
        T4.start();

        T1.join();  // Wait for thread T1 to finish
        T2.join();  // Wait for thread T2 to finish
        T3.join();  // Wait for thread T3 to finish
        T4.join();  // Wait for thread T4 to finish
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

    static class multiThreading extends Thread {
        private final int[] arr;
        private final char operation;

        multiThreading(int[] arr, char operation) {
            this.arr = arr;
            this.operation = operation;
        }

        public void run() {
            System.out.println("Thread Result for " + operation + ": " + performOperation(arr, operation) + " - " + Thread.currentThread().getName());
        }
    }
}
