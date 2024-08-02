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
        for (int value:arr)
        {
            int x=value;
            int sum1=0;
            int sum2=0;
            while(x>0)
            {
                sum1+=x%10;
                if(x%10==1 || x%10==2 || x%10==3)
                    sum2+=x%10;
                x/=10;
            }
            if(sum1==sum2)
                list.add(value);
        }
        return list;
     }
}
