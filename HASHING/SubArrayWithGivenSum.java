package HASHING;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={15,2,8,10,-5,-8,6};
        ArrayList<Integer> list  =new ArrayList<>();
        for (int i=0; i< arr.length; ++i)
        {
            int sum=0;
            for (int j=i; j< arr.length; ++j)
            {
                sum+=arr[j];
            }
            list.add(sum);
        }
        System.out.println(list);
    }

}
