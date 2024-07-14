package HASHING;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplementationOfChaining {
    public static void main(String[] args) {
        ArrayList<LinkedList<Integer>> HashTable = new ArrayList<>();
        int key=7;
        int [] insertValue= {10,20,15,7};
        int n=HashTable.size();
        


    }
    static void insert(int [] insertValue , ArrayList<LinkedList<Integer>> HashTable,int key) {
        for (int i=0; i< insertValue.length; ++i)
            HashTable.get(i%key).add(insertValue[i]);
    }
}
