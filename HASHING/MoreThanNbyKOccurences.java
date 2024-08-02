package HASHING;

import java.util.HashMap;

public class MoreThanNbyKOccurences {
    public static void main(String[] args) {
        int [] arr ={3,1,2,2,1,2,3,3};
        System.out.println(count(arr, arr.length, 4));
    }
    private static int count(int [] arr,int n,int k) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        int count=0;

        System.out.println(hashMap.values());
        return count;
    }
}
