package HASHING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class ImplementationOfChaining {

    ArrayList<LinkedList<Integer>> HashTable = new ArrayList<LinkedList<Integer>>();

    int key=7;

    public static void main(String[] args) {
        ImplementationOfChaining Table= new ImplementationOfChaining();
        for (int i=0; i<Table.key; i++)
            Table.HashTable.add(i,new LinkedList<>());

        Table.Insert(10);
        Table.Insert(20);
        Table.Insert(15);
        Table.Insert(7);
        System.out.println(Table.Search(10));
        Table.Delete(15);
        System.out.println(Table.Search(15));
        for (int i=0; i<Table.HashTable.size(); ++i)
        {
            System.out.print(i+" ");
            for (int j=0; j<Table.HashTable.get(i).size(); ++j)
            {
                System.out.print(Table.HashTable.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

     void Insert(int insertValue) {
        HashTable.get(insertValue % key).add(insertValue);
    }

    boolean Search(int target) {
        return HashTable.get(target%key).contains(target);
    }
    void Delete(int value) {
        HashTable.get(value%key).remove(Integer.valueOf(value));
    }
}
