package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    public static void main(String[] args) {
        int [] median ={1,2,3,4,5,6,7,8,9,10};

        if((median.length%2)==0)
            System.out.println(median[(median.length)/2]+1);
        else System.out.println(median[median.length/2]-1);

    }
}