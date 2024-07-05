package MATRIX;

import java.util.Random;

public class MultiDimesionalArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=arr.length;
//        for (int i=0; i<n; i++)
//        {
//            for (int x:arr[i])
//                System.out.print(x+" ");
//        }
        Random random = new Random();

        int [][] arr2=new int[8][];
        for (int i=0; i< arr2.length; i++)
        {
            arr2[i]=new int[random.nextInt(1,9)];
            for (int j=0; j< arr2[i].length; j++){
                arr2[i][j]=random.nextInt(100,209);
            }
        }
        for (int []x:arr2) {
            System.out.print("[");
            for (int x1 : x)
                System.out.print(x1 + " ");
            System.out.println("]");
            System.out.println("]");
        }
    }
}
