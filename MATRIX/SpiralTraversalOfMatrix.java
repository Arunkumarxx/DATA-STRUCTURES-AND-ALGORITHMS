package MATRIX;

import java.util.ArrayList;

public class SpiralTraversalOfMatrix {
    static ArrayList<Integer> SpiralTraversal(int [][] matrix) {
        int n=matrix.length;

        int top=0,bottom=n-1;
        int left=0 ,right=matrix[0].length-1;
        ArrayList<Integer> arrayList =new ArrayList<>();
        if(n==1)
        {
            for (int i=left; i<=right ;i++)
            {
                arrayList.add(matrix[top][i]);
            }
            return arrayList;
        }
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
        return arrayList;
        
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8}
        };
        System.out.println(SpiralTraversal(matrix));
    }
}
