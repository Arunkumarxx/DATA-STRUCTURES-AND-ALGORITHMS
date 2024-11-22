package BACKTRACKING;

import java.util.ArrayList;

public class UniqueSubsets
{
    private  ArrayList<ArrayList<Integer>> list;
    private ArrayList<ArrayList<Integer>> uniqueSubsets(int [] arr,int n)
    {
        list=new ArrayList<>();
        generateUniqueSubSets(arr,new ArrayList<>(),n,0);
        return list;
    }
    private void generateUniqueSubSets(int [] arr,ArrayList<Integer> arrayList,int n,int ind)
    {
        list.add(arrayList);
        for(int i=0;i<n;++i)
        {
            generateUniqueSubSets(arr,arrayList,n,ind+1);
        }
    }

    public static void main(String[] args)
    {
        UniqueSubsets uniqueSubsets =new UniqueSubsets();
        int [] arr ={1,2,3};
        System.out.println(uniqueSubsets.uniqueSubsets(arr,arr.length));
        System.out.println(uniqueSubsets.list);
    }

}
