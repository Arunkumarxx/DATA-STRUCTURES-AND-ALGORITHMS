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
        for(int i=0; i<arr.size(); ++i)
        {
            int x=arr.get(i);
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
                list.add(arr.get(i));
        }
        return list;
        
    }
}
