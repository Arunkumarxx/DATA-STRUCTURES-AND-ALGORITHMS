package MATRIX;

public class ReversingTheColumnsOfAMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                { 1,  2,  3},
                { 5,  6,  7},
                {11, 10,  9},
                {13, 14, 15}
        };
        int i=0;
        int n=matrix.length;
        while(i<n)
        {
            int start=0;
            int end= matrix[i].length-1;
            while(start<=end)
            {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                ++start;
                --end;
            }
            ++i;
        }
        for (int [] temp:matrix) {
            for (int ele : temp)
                System.out.print(ele);
            System.out.println();
        }
    }

}
