package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    static int MedianOfRowWiseSortedBruteForce(int [][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;
        int median=(n*m)/2;

        for (int i=0; i<n; i++)
        {

            for (int j=m-1; j>=0; j--)
            {
                int count=0;
                int ele=matrix[i][j];
                for (int k=0; k<n; k++)
                {
                    for (int s=0; s<matrix[k].length; s++)
                    {
                        if(matrix[k][s]<ele)
                            count++;
                        if(count>median)
                            break;
                    }
                    if(count>median)
                        break;

                }
                if(count==median)
                    return ele;
                if(count<median)
                    break;
            }
        }
        return -1;
    }
    static int MedianOfRowWiseSortedEfficient(int [][] matrix, int r,int c) {
        // pick smallest element
        int n= matrix.length;

        int min=matrix[0][0];

        int max=matrix[0][0];
        // find smallest element in matrix
        for (int i=0; i<n;i++)
           min= Math.min(matrix[i][0],min);
        //find largest element in matrix
        for (int i=0; i<n;i++)
            max=Math.max(max,matrix[i][matrix[i].length-1]);

        //median =n*n/2 bcz consider matrix is odd dude.....
        int median=r*c/2;

        while(min<max)
        {
            int mid=(min+max)/2;
            int count=0;
            for (int i=0;i<n; i++)
            {
                count+=countSmallestNumber(matrix[i],mid);
            }
            if(count<=median)
                min=mid+1;
            else max=mid;
        }

        return min;
    }
    static int countSmallestNumber(int [] arr,int target) {
        int count=0;
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=target)
                low=mid+1;
            else high=mid-1;
        }
        return low;

    }
    public static void main(String[] args) {
        int [][] matrix ={
                {1,10,20,21},
                {15,25,35,36},
                {5,30,40,41}
        };
        System.out.println(MedianOfRowWiseSortedBruteForce(matrix));
        System.out.println(MedianOfRowWiseSortedEfficient(matrix,matrix.length,matrix[0].length));
    }
}