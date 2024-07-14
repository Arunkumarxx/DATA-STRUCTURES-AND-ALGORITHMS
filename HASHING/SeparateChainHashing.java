package HASHING;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SeparateChainHashing {
    public static void main(String[] args){
        int [] arr ={50,21,58,17,15,48,56,22,23,25};

        HashMap<Integer,List<Integer>> chain = new HashMap<>();

        int n=10;

        int key=7;

        for (int i=0; i<n; i++)
            chain.put(i,new LinkedList<>());

        for (int i=0; i<n; i++)
            chain.get(arr[i]%key).add(arr[i]);

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(chain.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
    }
}
