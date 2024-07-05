package MATRIX;

public class Passing2DArraysAsArguments {
    static void print(int [][] arr){
        for (int [] x:arr)
            for (int y:x)
                System.out.print(y+" ");
    }
    public static void main(String[] args) {
        int [][] arr ={{1},{1,2},{1,2,3}};
        print(arr);
    }
}
