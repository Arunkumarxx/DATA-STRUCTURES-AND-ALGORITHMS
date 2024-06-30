package SORTING;

import java.util.Arrays;

public class CountTheNumberOfPossibleTriangles {
    public static void main(String[] args) {
        int [] arr ={1,16,20,3,4,6,12,13};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}