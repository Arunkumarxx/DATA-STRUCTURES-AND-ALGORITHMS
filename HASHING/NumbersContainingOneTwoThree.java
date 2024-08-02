package HASHING;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersContainingOneTwoThree {
    public static void main(String[] args) {
        int [] arr ={9, 12, 23, 45, 132};
        int n= arr.length;
        System.out.println(numbersContains123(arr,n));
     }
     private static ArrayList<Integer> numbersContains123(int [] arr,int n) {
         System.out.println(Arrays.toString(arr));
        return new ArrayList<>();
     }
}
