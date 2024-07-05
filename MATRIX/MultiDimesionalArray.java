package MATRIX;

public class MultiDimesionalArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{23,2123,343,2},{7,8,9}};
        int n=arr.length;
        for (int i=0; i<n; i++)
        {
            for (int x:arr[i])
                System.out.print(x+" ");
        }
    }
}
