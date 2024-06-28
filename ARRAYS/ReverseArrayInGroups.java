package ARRAYS;

import java.util.ArrayList;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int n=5;
        int k=3;
        for(int i=0; i<n; i+=k){
            int start=i, end=Integer.min(i+k-1,n-1);
            while(start<end){
                int  temp= arr.get(i);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
       for (int x:arr)
           System.out.print(x+" ");
    }
}