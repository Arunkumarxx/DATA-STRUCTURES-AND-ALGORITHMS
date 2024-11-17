package BACKTRACKING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum
{
    ArrayList<int []> result =new ArrayList<>();
    private void combinationSum(int [] arr,int target)
    {
        int sum=0;
        for(int val:arr)
        {
            sum+=val;
            if(sum==target)
            {
                result.add(arr);
                return;
            }
            if(sum>target)
                return;
        }
        int [] newArray = new int [arr.length+1];
        int ind=0;
        for(int val:arr)
            newArray[ind++]=val;

        for(int i=0;i<arr.length;++i)
        {
            newArray[newArray.length-1]=arr[i];
            combinationSum(newArray,target);
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
        sum.combinationSum(arr,target);
        System.out.println(sum.result);
    }
}
