package HASHING;

import java.util.HashMap;

public class SubarraysWithEqual1sAnd0s {

    public static void main(String[] args) {
        int [] arr ={1,0,0,1,0,1,1};
        int n= arr.length;
        int res=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();

        int sum=0;
        hashMap.put(0,-1);
        for (int i=0; i<n;++i)
        {
            sum=arr[i]==0?sum-1:sum+1;
            if(hashMap.containsKey(sum))
                ++res;
            if(!hashMap.containsKey(sum))
                hashMap.put(sum,i);
        }
        System.out.println(res);
    }

}
