package HASHING;

import java.util.HashMap;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String [] arr= {"lucas"," emma", "lucas", "emma", "emma", "lucas", "lucas"};
        int n= arr.length;
        System.out.println(Winner(arr,n));
    }
    private static String  Winner(String [] arr,int n) {
        HashMap<String,Integer> hashMap =new HashMap<>();
        int max=0;
        for(int i=0; i<n; ++i) {
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
            max=Math.max(max,hashMap.get(arr[i]));
        }
        System.out.println(hashMap);
        System.out.println(max);
        return "";
    }
}
