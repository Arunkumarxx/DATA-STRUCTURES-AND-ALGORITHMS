package MATRIX;

public class InterchangingTheRowsOfAMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4 },
                {5, 6, 7, 8 },
                {9,10,11,12 },
                {13,14,15,16}
        };

        int start=0;
        int end= matrix.length-1;
        int m= matrix[0].length;
        while(start<end)
        {
            int i=0;
            int j=0;
            while(i<m && j<m)
            {
                int temp=matrix[start][i];
                matrix[start][i]=matrix[end][j];
                matrix[end][j]=temp;
                ++i;
                ++j;
            }
            ++start;
            --end;
        }
        for (int [] temp : matrix) {
            for (int x : temp)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
