package BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum
{
    ArrayList<int []> result =new ArrayList<>();
    private void combinationSum(ArrayList<Integer> list,int target)
    {
        int sum=0;
        for(int i=0;i<list.size();++i)
        {
            sum+=list.get(i);
            if(sum==target)
            {
                System.out.println(list);
                return;
            }
            if(sum>target)
                return;
        }
        for(int i=0;i<list.size();++i)
        {
            list.add(list.get(i));
            combinationSum(list,target);
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
        sum.combinationSum(arrayList,target);
        System.out.println(sum.result);
    }
}
