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
        for(String x:arr)
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        System.out.println(hashMap);
        return "";
    }
}
