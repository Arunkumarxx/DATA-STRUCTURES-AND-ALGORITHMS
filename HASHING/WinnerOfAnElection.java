package HASHING;

import java.util.*;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String [] arr= {"a","a","b","b","c"};
        int n= arr.length;
        System.out.println(Arrays.toString(Winner(arr,n)));
    }
    private static String[]  Winner(String [] arr,int n) {
        HashMap<String,Integer> hashMap =new HashMap<>();
        TreeSet<String> treeSet =new TreeSet<>();
        int max=0;
        for(int i=0; i<n; ++i) {
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
            if(hashMap.get(arr[i])>max) {
                max = hashMap.get(arr[i]);
                treeSet.clear();
                treeSet.add(arr[i]);
            }
            else if(hashMap.get(arr[i])==max)
            {
                treeSet.add(arr[i]);
            }
        }
        String [] res =new String[2];
        if(treeSet.size()==2)
        {
            res[0]=treeSet.first();
            res[1]=treeSet.getLast();
            return res;
        }
        System.out.println(treeSet);
        return res;
    }
}
