package MATRIX;

import ARRAYS.Arrays;

public class MatrixOperationsAdditionSubtractionMultiplication {
    static void add(int [][] arrOne,int [][]arrTwo,int [][] result) {
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]+arrTwo[i][j];
            }
        }
    }
    static void sub(int [][] arrOne,int [][]arrTwo,int [][] result) {
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]+arrTwo[i][j];
            }
        }
    }
    static void divide(int [][] arrOne,int [][]arrTwo,int [][] result) {
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]+arrTwo[i][j];
            }
        }
    }
    static void multi(int [][] arrOne,int [][]arrTwo,int [][] result) {
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]+arrTwo[i][j];
            }
        }
    }
    static void print(int [][] result) {
        for (int [] row :result) {
            for (int row_col : row)
                System.out.print(row_col + " ");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int [][] arrOne ={{1,2},{4,5}};
        int [][] arrTwo ={{5,6},{8,9}};
        int [][] result =new int[arrOne.length][];
        add(arrOne,arrTwo,result);      print(result);
        sub(arrOne,arrTwo,result);      print(result);
        multi(arrOne,arrTwo,result);    print(result);
        Object [] arr = {"Arun","kumar"};
        System.out.println(arr);
    }
}
