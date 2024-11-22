package BACKTRACKING;

import java.util.ArrayList;

public class UniqueSubsets
{
    private  ArrayList<ArrayList<Integer>> list;
    private ArrayList<ArrayList<Integer>> uniqueSubsets(int [] arr,int n)
    {
        list=new ArrayList<>();
        generateUniqueSubSets(arr,n,0);
        return list;
    }
    private void generateUniqueSubSets(int [] arr,int n,int ind)
    {
        
    }

    public static void main(String[] args)
    {
        UniqueSubsets uniqueSubsets =new UniqueSubsets();
        int [] arr ={1,2,3};
        System.out.println(uniqueSubsets.uniqueSubsets(arr,arr.length));
        System.out.println(uniqueSubsets.list);
    }

}
