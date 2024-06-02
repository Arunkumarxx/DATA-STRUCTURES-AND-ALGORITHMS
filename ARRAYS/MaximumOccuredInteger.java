package ARRAYS;

import java.util.Arrays;
import java.util.HashMap;

class  MaximumOccuredInteger{
    static int MaximumOccuredInt(int [] l,int [] r, int n) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i=0; i<n; i++)
        {
            for (int j=l[i]; j<=r[i];j++){
                if (!hashMap.containsKey(j))
                {
                    hashMap.put(j,1);

                }
                else hashMap.put(j, hashMap.get(j)+1);
            }
        }
        int max=0;
        for (int x:hashMap.keySet())
            if(hashMap.get(x)>max){
                max=hashMap.get(x);
            }
        return max;
    }
    static int MaxiOccured(int[] l,int []r,int n,int max) {
        int [] freq = new int[max+3];
        for (int i=0 ;i<n; i++){
            freq[l[i]]+=1;
            freq[r[i]+1]-=1;
        }
        int result=0;
        int maxoccurence=0;
        for (int x:freq)
            System.out.print(x+" ");
        System.out.println();
        for(int i=0; i<=max+1; i++)
        {
            if (i>0)
                freq[i]+=freq[i-1];
            if(freq[i]>maxoccurence) {
                maxoccurence = freq[i];
                result=i;
            }
        }

        for (int x:freq)
            System.out.print(x+" ");
        return result;
    }
    public static void main(String[] args) {
        int [] arr1={1,4,3,1};
        int [] arr2={15,8,5,4};

//     int result=   MaximumOccuredInt(arr1,arr2,arr1.length);
     int result2 = MaxiOccured(arr1,arr2,arr1.length,15);
//        System.out.println("\n"+result);
        System.out.println(" \n"+result2);

    }
}