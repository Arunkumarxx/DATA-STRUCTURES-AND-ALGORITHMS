package JAVA_COLLECTION_FRAMEWORK;

class MultiThreading extends Thread {
    private final int[] arr;
    private final char operation;

    MultiThreading(int[] arr, char operation) {
        this.arr = arr;
        this.operation = operation;
    }

    public void run() {
        System.out.println("Result for " + operation + ": " + performOperation(arr, operation) + " - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        MultiThreading T1 = new MultiThreading(arr, '+');
        MultiThreading T2 = new MultiThreading(arr, '-');
        MultiThreading T3 = new MultiThreading(arr, '/');
        MultiThreading T4 = new MultiThreading(arr, '*');

        T1.start();  // Start thread T1
        T2.start();  // Start thread T2
        T3.start();  // Start thread T3
        T4.start();  // Start thread T4
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
                        return 0; // Return 0 or handle it according to your logic
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
