package BACKTRACKING;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum
{
    private ArrayList<ArrayList<Integer>> result=new ArrayList<>();

    private void cbmSum(ArrayList<Integer> arr, ArrayList<Integer> list, int target, int sum, int ind)
    {
        if(sum==target)
            result.add(new ArrayList<>(list));

        if(sum>target)
            return;


        for(int i=ind;i<arr.size();++i)
        {
            if(i>ind&&arr.get(i)==arr.get(i-1))
                continue;

            list.add(arr.get(i));
            cbmSum(arr, list, target, sum+arr.get(i), i);
            list.remove(list.size()-1);
        }
    }

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        result.clear();
        Collections.sort(A);
        ArrayList<Integer> list=new ArrayList<>();
        cbmSum(A, list, B, 0, 0);
        list.forEach((a)-> System.out.println(a));
        return new ArrayList<>();
    }

    public static void main(String[] args)
    {
        CombinationSum sum=new CombinationSum();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(6);
        arr.add(5);
        arr.add(7);
        arr.add(1);
        arr.add(8);
        arr.add(2);
        arr.add(9);
        arr.add(7);
        arr.add(7);
        arr.add(9);
        int target=6;
        System.out.println(sum.combinationSum(arr, target));
    }
}
