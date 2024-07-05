package MATRIX;

import java.util.Arrays;
import java.util.Random;

public class AddingTwoMatrices {
    public static void main(String[] args) {

        int [][] arrOne =new int[4][4];
        int [][] arrTwo =new int[4][4];
        for (int i=0; i<arrOne.length; i++)
        {
            Random random = new Random();
            Arrays.fill(arrOne[i],random1.nextInt(41,100));
            Random random2 = new Random();
            Arrays.fill(arrTwo[i],random2.nextInt(10,200));
        }
        int [][] result = Add(arrOne,arrTwo);
        for (int [] x:result) {
            for (int y : x)
                System.out.print(y + "\t");
            System.out.println();
        }

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
