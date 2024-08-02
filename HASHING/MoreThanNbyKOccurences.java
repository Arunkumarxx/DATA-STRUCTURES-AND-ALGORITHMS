package HASHING;

import java.util.HashMap;

public class MoreThanNbyKOccurences {
    public static void main(String[] args) {
        int [] arr ={30,10,20,20,10,20,30,30};
        System.out.println(count(arr, arr.length, ));
    }
    private static int count(int [] arr,int n,int k) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        System.out.println(hashMap);
        return -1;
    }
}
