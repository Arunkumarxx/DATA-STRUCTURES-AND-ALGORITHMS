package MATRIX;

public class RotateMatrixAntiClockwiseBy90 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        for (int i=0;  i<n; i++)
        {
            int start=0;
            int end=n-1;
            while(start<end)
            {
                int temp=matrix[start][i];
                matrix[start][i]=matrix[end][i];
                matrix[end][i]=temp;
                start++;
                end--;
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++)
            {
                if(i>j)
                    continue;;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for (int [] y:matrix) {
            for (int x : y)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
