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
        ArrayList<String> arrayList =new ArrayList<>();
        int max=0;
        for(int i=0; i<n; ++i) {
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
            if(hashMap.get(arr[i])>max) {
                max = hashMap.get(arr[i]);
                arrayList.clear();
                arrayList.add(arr[i]);
            }
            else if(hashMap.get(arr[i])==max)
            {
                arrayList.add(arr[i]);
            }
        }
        String [] res =new String[2];
        if(arrayList.size()==2)
        {
            res[0]=arrayList.get(0);
            res[1]=max+"";
            return res;
        }
        res[0]=arrayList.getFirst();
        res[1]=max+"";
        return res;
    }
}
