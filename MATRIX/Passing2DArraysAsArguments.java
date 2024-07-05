package MATRIX;

public class Passing2DArraysAsArguments {
    static void print(int [][] arr){
        for (int [] x:arr)
            for (int y:x)
                System.out.print(y+" ");
    }
    static void printTwo(int [][] arr){
        for (int [] x:arr)
            for (int y:x)
                System.out.print(y+" ");
    }
    public static void main(String[] args) {
        int [][] arr ={{1},{3,4},{5,6,7}};
        print(arr);
        int [][] arr2 = new int[2][2];
        printTwo(arr2);
    }
}
