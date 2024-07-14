package HASHING;

import java.util.ArrayList;

import java.util.LinkedList;


public class ImplementationOfChaining {

    ArrayList<LinkedList<Integer>> HashTable = new ArrayList<LinkedList<Integer>>();

    int key=7;

    public static void main(String[] args) {
        ImplementationOfChaining Table= new ImplementationOfChaining();
        for (int i=0; i<Table.key; i++)
            Table.HashTable.add(i,new LinkedList<>());

        Table.Insert(432);
        Table.Insert(12);
        Table.Insert(954);
        Table.Insert(2398);
        Table.Insert(238);
        Table.Insert(28);
        Table.Insert(98);
        System.out.println(Table.Search(954));
        Table.Delete(12);
        System.out.println(Table.Search(2398));
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
