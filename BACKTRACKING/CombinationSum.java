package BACKTRACKING;

import java.util.ArrayList;

public class CombinationSum
{
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        result.clear();
        Collections.sort(A);
        ArrayList<Integer> list =new ArrayList<Integer>();
        cbmSum(A,list,B,0,0);
        return result;
    }
    private static ArrayList<ArrayList<Integer>> result =new ArrayList<>();
    private static void cbmSum(ArrayList<Integer>arr, ArrayList<Integer> list, int target, int sum, int ind)
    {
        if(sum==target)
            result.add(new ArrayList<>(list));

        if(sum>target)
            return;

        for(int i =ind; i<arr.size();++i)
        {
            if (i > ind && arr.get(i) == arr.get(i - 1))
                continue;

            list.add(arr.get(i));
            cbmSum(arr,list,target,sum+arr.get(i),i);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {2,3,6,7};
        int target=7;
        CombinationSum sum =new CombinationSum();
        ArrayList<Integer> arrayList =new ArrayList<>();
        sum.cbmSum(arr,arrayList,target,0,0);
        System.out.println(sum.result);
    }
}
