package MATRIX;

import java.util.ArrayList;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int n= matrix.length;
        int topLeft=0,
            topRight= matrix[0].length-1
           ,BottomRight= matrix[n-1].length-1,
            BottomLeft=n-1;
        ArrayList<Integer> arrayList =new ArrayList<>();
        for (int i=topLeft; i<=topRight; i++)
        {
            arrayList.add(matrix[topLeft][i]);
        }
        System.out.println(arrayList);
    }
}
