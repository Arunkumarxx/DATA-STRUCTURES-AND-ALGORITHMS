package MATRIX;

import java.util.Random;

public class Passing2DArraysAsArguments {
    static void print(int [][] arr){
        for (int [] x:arr)
            for (int y:x)
                System.out.print(y+" ");
    }
    static void printTwo(int [][] arr){
        Random random = new Random();
        for (int i=0;i< arr.length; i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=random.nextInt(1,10);// range 1 to 10 random values
            }
        }
        for (int [] x:arr)
            for (int y:x)
                System.out.print(y+" ");
    }
    public static void main(String[] args) {
        int [][] arr ={{1},{3,4},{5,6,7}};
        print(arr);
        System.out.println();
        int [][] arr2 = new int[2][2];
        printTwo(arr2);
    }
}
