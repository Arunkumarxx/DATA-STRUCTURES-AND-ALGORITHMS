package MATRIX;

import java.util.Arrays;

public class MatrixOperationsAdditionSubtractionMultiplication {
    static void add(int [][] arrOne,int [][]arrTwo,int [][] result) {
        System.out.println("Addition");
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]+arrTwo[i][j];
            }
        }

    }
    static void sub(int [][] arrOne,int [][]arrTwo,int [][] result) {
        System.out.println("Subtraction");
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]-arrTwo[i][j];
            }
        }
    }
    static void divide(int [][] arrOne,int [][]arrTwo,int [][] result) {
        System.out.println("Division");
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]/arrTwo[i][j];
            }
        }

    }
    static void multi(int [][] arrOne,int [][]arrTwo,int [][] result) {
        System.out.println("multiplycation");
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]*arrTwo[i][j];
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
    static void empty(int [][] result){
        Arrays.fill(result,0);
    }
    public static void main(String[] args) {
        int [][] arrOne ={{11,12},{4,512}};
        int [][] arrTwo ={{523,6},{812,921}};
        int [][] result =new int[arrOne.length][];
        add(arrOne,arrTwo,result);      print(result);
        sub(arrOne,arrTwo,result);      print(result);
        multi(arrOne,arrTwo,result);    print(result);
    }
}
