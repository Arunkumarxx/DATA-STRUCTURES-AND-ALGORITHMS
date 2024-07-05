package MATRIX;


import java.util.Random;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        MatrixPrinter.printMatrix();
        
    }
}

class MatrixPrinter {
    public static void printMatrix() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int x : arr[i]) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}

class RandomMatrixGenerator {
    public static void generateRandomMatrix() {
        Random random = new Random();

        int[][] arr2 = new int[8][];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new int[5];
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(Integer.MAX_VALUE) + 1;
            }
        }
        for (int[] x : arr2) {
            System.out.print("[ ");
            for (int x1 : x)
                System.out.print(x1 + " ");
            System.out.print("]");
            System.out.println();
        }
    }
}
