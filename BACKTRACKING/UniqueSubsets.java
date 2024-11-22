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
        if(ind==n-1)
            return;

        ArrayList<Integer> innerList =new ArrayList<>();

        for(int i=0;i<=ind;++i)
            innerList.add(arr[i]);

        list.add(innerList);

        generateUniqueSubSets(arr,n,ind+1);

        innerList.clear();

        for(int i=0;i<ind;++i)
            innerList.add(arr[i]);

        for(int i=ind+1;i<n;++i)
            innerList.add(arr[i]);
    }

    public static void main(String[] args)
    {
        UniqueSubsets uniqueSubsets =new UniqueSubsets();
        int [] arr ={1,2,3};
        System.out.println(uniqueSubsets.uniqueSubsets(arr,arr.length));
        System.out.println(uniqueSubsets.list);
    }

}
