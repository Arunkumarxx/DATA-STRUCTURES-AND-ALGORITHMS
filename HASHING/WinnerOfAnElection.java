package HASHING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String [] arr= {"lucas"," emma", "lucas", "emma", "emma", "lucas", "lucas"};
        int n= arr.length;
        System.out.println(Winner(arr,n));
    }
    private static String  Winner(String [] arr,int n) {
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
        System.out.println(hashMap);
        
        return "";
    }
}
