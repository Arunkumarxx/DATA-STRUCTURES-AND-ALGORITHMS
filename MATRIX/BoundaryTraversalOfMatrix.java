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
        int j=0;
        for (int i=0; i<n ; i++)
        {
            if(i==0)
                for (int [] x:arr)
                    for (int y:x)
                        arrayList.add(y);
        }
        System.out.println(arrayList);
    }
}