package HASHING;

import java.util.Arrays;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        int [] arr ={1,2,1,3,4,2,3};
        Arrays.sort(arr);
        long e=System.currentTimeMillis();
        System.out.println(s+"ms");
        System.out.println(e+"ms");
    }
}