package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {

    public static void main(String[] args) {
        int [][] arr ={
                       {1, 2, 3, 4 },
                       { 5, 6, 7, 8},
                       {9,10, 11,12},
                       {13,14,15,16}
        };
        int n= arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k=0;
        for (int i=0; i<arr[0].length-1; i++)
            arrayList.add(arr[k][i]);

        for (int i=0; i<n-1;i++) {
            k=arr[i].length-1;
            arrayList.add(arr[i][k]);
        }
        k=arr[n-1].length-1;
        for (;k>=1;k--)
        {
            arrayList.add(arr[n-1][k]);
        }
        k=0;
        for ( int i=n-1; i>=0; i--)
            arrayList.add(arr[i][0]);
        System.out.println(arrayList);
    }
}