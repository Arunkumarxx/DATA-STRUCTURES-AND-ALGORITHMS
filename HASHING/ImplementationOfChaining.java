package HASHING;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplementationOfChaining {
    ArrayList<LinkedList<Integer>> HashTable = new ArrayList<>();

    int key=7;
    public static void main(String[] args) {

        int key = 7;
        int n = HashTable.size();
        insert(10);

    }

    static void insert(int insertValue) {
        ImplementationOfChaining.HashTable.get(insertValue % key).add(insertValue);
    }
}
