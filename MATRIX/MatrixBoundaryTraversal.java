package MATRIX;

public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= arr.length;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                if((i==0))
                    System.out.print(arr[i][j]+"\t");
                
            }
        }
    }
}
