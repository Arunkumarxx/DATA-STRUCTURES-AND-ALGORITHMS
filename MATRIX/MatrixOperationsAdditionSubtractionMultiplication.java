package MATRIX;

public class MatrixOperationsAdditionSubtractionMultiplication {
    public static void main(String[] args) {
        int [][] arrOne ={{1,2},{4,5}};
        int [][] arrTwo ={{5,6},{8,9}};
        int [][] result =new int[arrOne.length][];
        for (int i=0;i<arrOne.length; i++) {
            result[i]= new int[arrOne[i].length];
            for (int j = 0; j < arrOne[i].length; j++){
                result[i][j]=arrOne[i][j]+arrTwo[i][j];
            }
        }
    }
}
