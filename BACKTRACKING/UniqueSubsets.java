package BACKTRACKING;

import java.util.ArrayList;

public class UniqueSubsets
{
    private static ArrayList<ArrayList<Integer>> list =new ArrayList<>();
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {

        list.clear();
        Arrays.sort(arr);
        generateUniqueSubSets(arr,new ArrayList<>(),n,0);
        return list;
    }
    private static void generateUniqueSubSets(int [] arr,ArrayList<Integer> arrayList,int n,int ind)
    {
        list.add(new ArrayList<>(arrayList));
        for(int i=ind;i<n;++i)
        {
            if(i>ind  && arr[i-1]==arr[i])
                continue;

            arrayList.add(arr[i]);

            generateUniqueSubSets(arr,arrayList,n,i+1);

            arrayList.remove(arrayList.size()-1);
        }
    }
    public static void main(String[] args)
    {
        UniqueSubsets uniqueSubsets =new UniqueSubsets();
        int [] arr ={1,2,3};
        System.out.println(uniqueSubsets.uniqueSubsets(arr,arr.length));
    }

}
