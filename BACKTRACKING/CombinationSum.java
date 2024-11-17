package BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum
{
    ArrayList<int []> result =new ArrayList<>();
    private void combinationSum(int [] arr,ArrayList<Integer> list,int target)
    {
        for(int i =0; i<arr.length;++i)
        {
            list.add(arr[i]);
            combinationSum(arr,list,target);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {2,3,6,7};
        int target=7;
        CombinationSum sum =new CombinationSum();
        ArrayList<Integer> arrayList =new ArrayList<>();
        for(int val:arr)
            arrayList.add(val);
        sum.combinationSum(arr,arrayList,target);
        System.out.println(sum.result);
    }
}
