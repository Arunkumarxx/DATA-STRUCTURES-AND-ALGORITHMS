package MATRIX;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= matrix.length;
        int [] rowSum =new int[n];
        int [] colSum = new int[n];
         for (int i=0; i<n; i++)
         {
             for (int j=0; j<matrix[0].length; j++)
             {
                 rowSum[i]+=matrix[i][j];
                 colSum[j]+=matrix[i][j];
             }
         }
        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.toString(colSum));
    }
}
