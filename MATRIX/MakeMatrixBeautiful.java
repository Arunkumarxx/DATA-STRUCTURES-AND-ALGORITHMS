package MATRIX;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2},
                {3, 4}
        };
        int n= matrix.length;
        int [] row=new int[n];
        int [] cols = new int[matrix[0].length];
        // row max value
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                row[i]+=matrix[i][j];
            }
        }
        for (int i=0; i<matrix[0].length; i++)
        {
            for (int j=0; j<n; j++)
            {
                cols[i]+=matrix[j][i];
            }
        }
        int max=Integer.MIN_VALUE;
        int lenR= row.length;
        int lenC= cols.length;
        int i=0;
        while(i<Math.min(lenR,lenC))
        {
            max=Math.max(row[i],cols[i]);
            i++;
        }
        while(i<lenR) {
            max = Math.max(row[i], max);
            i++;
        }
        while(i<lenC) {
            max = Math.max(cols[i], max);
            i++;
        }
        System.out.println(max);
        

    }
}
