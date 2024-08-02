package HASHING;

import java.util.*;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String [] arr= {"dave", "dave", "dave", "carol", "carol", "carol", "carol"};
        int n= arr.length;
        System.out.println(Arrays.toString(Winner(arr,n)));
    }
    private static String[]  Winner(String [] arr,int n) {
        HashMap<String,Integer> hashMap =new HashMap<>();
        ArrayList<String> list =new ArrayList<>();
        int max=0;
        for(int i=0; i<n; ++i) {
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
            if(hashMap.get(arr[i])>max) {
                max = hashMap.get(arr[i]);
                list.clear();
                list.add(arr[i]);
            }
            else if(hashMap.get(arr[i])==max)
            {
                list.add(arr[i]);
            }
        }
        String [] res =new String[2];
        if(list.size()==2)
        {
            char one=(list.get(0)).charAt(0);
            char two=list.get(1).charAt(0);
            res [0]=one>two?list.get(0):list.get(1);
            res [1]=max+"";
            return res;
        }
        res[0]=list.get(0);
        res[1]=max+"";
        return res;
    }
}
