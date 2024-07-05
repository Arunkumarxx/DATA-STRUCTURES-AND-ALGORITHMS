package MATRIX;

import ARRAYS.Arrays;

public class MultiplyTheMatrices {
    public static void main(String[] args) {
        int [][] One = {
                {4,8},
                {0,2},
                {1,6}
        };
        int [][] Two ={
                {5,2},
                {9,4}
        };
        int n1=One.length;
        int n2=Two.length;
        int m1=One[0].length;
        int m2=Two[0].length;

        int [][] result  =new int[n1][100];
        for (int i=0; i<n1; i++)
        {
            for (int j=0; j<m1; j++)
            {
//                result[i]=new int[j];
                for (int k=0;k<m1; k++)
                {
                    result[i][j]+=One[j][k]*Two[k][j];
                }
            }
        }
        for (int x[]:result) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
