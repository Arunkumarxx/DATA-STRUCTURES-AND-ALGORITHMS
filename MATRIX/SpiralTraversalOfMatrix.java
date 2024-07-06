package MATRIX;

import java.util.ArrayList;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4}
        };
        int n=matrix.length;

        int top=0,bottom=n-1;
        int left=0 ,right=matrix[0].length-1;
        ArrayList<Integer> arrayList =new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for (int i=left; i<=right ;i++)
            {
                arrayList.add(matrix[top][i]);
            }
            top++;
            for (int i=top; i<=bottom;i++)
            {
                arrayList.add(matrix[i][right]);
            }
            right--;
            for (int i=right;i>=left; i--)
            {
                arrayList.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i=bottom;i>=top; i--)
            {
                arrayList.add(matrix[i][left]);
            }
            left++;
        }
        System.out.println(arrayList);
    }
}
