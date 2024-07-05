package MATRIX;

import java.util.Arrays;
import java.util.Random;

public class AddingTwoMatrices {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] arrOne = new int[][]
        Arrays.fill();
        Add()
    }
    static int [][] Add(int [][] arrOne,int [][] arrTwo) {
        int n1=arrOne.length;
        int n2=arrTwo.length;
        int m1=arrOne[0].length;
        int m2=arrTwo[0].length;

        if(n1!=n2||m1!=m2)
            return new int [0][0];

        int [][] result = new int[n1][m1];
        for(int i=0; i<n1; i++)
        {
            for(int j=0;j<m1; j++)
            {
                result [i][j]=  arrOne[i][j]+arrTwo[i][j];
            }
        }
        return result;
    }
}
