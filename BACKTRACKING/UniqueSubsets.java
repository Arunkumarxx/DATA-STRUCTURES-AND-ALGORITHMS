package BACKTRACKING;

import java.util.ArrayList;

public class UniqueSubsets
{
    private  ArrayList<ArrayList<Integer>> list;
    private ArrayList<ArrayList<Integer>> uniqueSubsets(int [] arr,int n)
    {
        generateUniqueSubSets(arr,n,0);
        return list;
    }
    private void generateUniqueSubSets(int [] arr,int n,int ind)
    {
        ArrayList<Integer> innerList =new ArrayList<>();
        for(int i=0;i<ind;++i)
        {
            innerList.add(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        UniqueSubsets uniqueSubsets =new UniqueSubsets();
        int [] arr ={1,2,3};
        System.out.println(uniqueSubsets.uniqueSubsets(arr,arr.length));
    }

}
