package HASHING;

import java.util.HashMap;
import java.util.Iterator;

public class MoreThanNbyKOccurences {
    public static void main(String[] args) {
        int [] arr ={2,3,3,2};
        System.out.println(count(arr, arr.length, 4));
    }
    private static int count(int [] arr,int n,int k) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        int count=0;

        Iterator itr =hashMap.values().iterator();

        while(itr.hasNext())
        if((int)itr.next()>(n/k))
            ++count;

        System.out.println(hashMap);
        return count;
    }
}
