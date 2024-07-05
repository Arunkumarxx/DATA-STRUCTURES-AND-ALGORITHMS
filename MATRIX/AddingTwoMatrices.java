package MATRIX;

import java.util.Arrays;
import java.util.Random;

public class AddingTwoMatrices {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrOne = new int[4][4];
        int[][] arrTwo = new int[4][4];


        fill(arrOne, 1, 100);
        fill(arrTwo, 1, 100);


        System.out.println("Matrix One:");
        displayMatrix(arrOne);


        System.out.println("\nMatrix Two:");
        displayMatrix(arrTwo);


        int[][] result = Add(arrOne, arrTwo);

        System.out.println("Arun Kumar");
        System.out.println("\nResult Matrix (Sum of Matrix One and Matrix Two):");
        displayMatrix(result);
    }

    static void fill(int[][] arr, int start, int end) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(1,100);
            }
        }
    }

    static int[][] Add(int[][] arrOne, int[][] arrTwo) {
        int n1 = arrOne.length;
        int m1 = arrOne[0].length;


        if (n1 != arrTwo.length || m1 != arrTwo[0].length) {
            System.out.println("Matrices have different dimensions. Cannot perform addition.");
            return new int[0][0];
        }


        int[][] result = new int[n1][m1];


        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                result[i][j] = arrOne[i][j] + arrTwo[i][j];
            }
        }

        return result;
    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
