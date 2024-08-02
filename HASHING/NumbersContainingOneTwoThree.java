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
            
        }
        return list;

    }
}
