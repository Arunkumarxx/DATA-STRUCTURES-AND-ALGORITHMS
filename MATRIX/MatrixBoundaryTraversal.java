package MATRIX;

public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,32,3,2,432},
                {4,5,6,23,32,3,3},
                {7,8,9,65,65,5,56},
                {8,9,65,65,5,56,23}
        };
        int n= arr.length;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                if((i==0||i==n-1))
                    System.out.print(arr[i][j]+"\t");
                else if(j==0||j==arr[i].length-1)
                    System.out.print(arr[i][j]+"\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
