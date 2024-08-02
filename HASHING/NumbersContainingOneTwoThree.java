package HASHING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersContainingOneTwoThree {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(132);
        int n= list.size();
        NumbersContainingOneTwoThree obj  =new NumbersContainingOneTwoThree();
        System.out.println(obj.filterByDigits(list));
     }
    public List<Integer> filterByDigits(List<Integer> arr) {
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        for (int x:arr)
        {
            int temp=x%10;
            boolean isValid=true;
            while(temp>0)
            {
                if(temp%10!=1 && temp%10!=2  && temp%10!=3)
                {
                    isValid=false;
                    break;
                }
                else temp/=10;
            }
            if(isValid)
                list.add(x);
        }
        return list;

    }
}
