package MATRIX;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2},
                {3,4}
        };
        int n= matrix.length;
        int [] rowSum =new int[n];
        int [] colSum = new int[n];
         for (int i=0; i<n; i++) {
             for (int j = 0; j < matrix[0].length; j++) {
                 rowSum[i] += matrix[i][j];
                 colSum[j] += matrix[i][j];
             }
         }
         int max=0;
         for (int i=0; i<n; i++){
             max=Math.max(max,rowSum[i]);
             max=Math.max(max,colSum[i]);
         }
        int op=0;
        for (int i=0; i<n; ++i)
        {
            op+=max-rowSum[i];
        }
        System.out.println(op);
    }
}
