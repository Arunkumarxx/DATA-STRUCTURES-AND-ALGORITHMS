package HASHING;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersContainingOneTwoThree {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        
        int n= arr.length;
        NumbersContainingOneTwoThree obj  =new NumbersContainingOneTwoThree();
        System.out.println(obj.filterByDigits());
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
