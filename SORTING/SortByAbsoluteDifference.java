package SORTING;

import java.util.LinkedList;
import java.util.List;

public class SortByAbsoluteDifference {
    public static void main(String[] args) {
        List<Integer> arrList = new LinkedList<>();
        int k=7;
        arrList.add(10);
        arrList.add(5);
        arrList.add(3);
        arrList.add(9);
        arrList.add(2);
        for (int i=0;i<arrList.size(); i++)
        {
            arrList.set(i,arrList.get(i)-k);
        }
    }
}
