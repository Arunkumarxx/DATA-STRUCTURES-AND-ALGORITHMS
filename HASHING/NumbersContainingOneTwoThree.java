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
        ArrayList<Integer> list =new ArrayList<>();
        for (int x:arr)
        {
            while(x>0)
            {
                if(x%10==1|| x%10==2 || x%10==3)
                    list.add(x);
                x/=10;
            }
        }
        return new ArrayList<>();
     }
}
