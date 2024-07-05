package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {
    static int  add(int [][] arr,int start,int end,ArrayList<Integer> arrayList) {
        for (int j= start; j < end; j++) {
            arrayList.add(arr[start][j]);
        }
    }
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<n ; i++)
        {
            if(i==0) add(arr,i,arr[i].length,arrayList);
            
        }
    }
}