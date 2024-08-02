package HASHING;

import java.util.HashMap;

public class MoreThanNbyKOccurences {
    public static void main(String[] args) {
        int [] arr ={30,10,20,20,10,20,30,30};
        System.out.println(count(arr, arr.length, 4));
    }
    private static int count(int [] arr,int n,int k) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        int count=0;
        for(int x: hashMap.values())
            if(hashMap.get(x)>n/k)
                System.out.println(hashMap.values());
        return -1;
    }
}
