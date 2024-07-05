package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {

    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k=0;
        for (int i=0; i<arr[0].length-1; i++)
            arrayList.add(arr[k][i]);
        k=n-1;
        for (int i=0; i<n;i++)
            arrayList.add(arr[i][k]);
        System.out.println(arrayList);
    }
}