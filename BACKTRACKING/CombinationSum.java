package BACKTRACKING;

import java.util.ArrayList;

public class CombinationSum
{
    ArrayList<ArrayList<Integer>> result =new ArrayList<>();
    private void cbmSum(int [] arr, ArrayList<Integer> list, int target, int sum, int ind)
    {
        if(sum==target)
            result.add(new ArrayList<>(list));

        if(sum>target)
            return;

        for(int i =ind; i<arr.length;++i)
        {
            list.add(arr[i]);
            cbmSum(arr,list,target,sum+arr[i],i);
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
