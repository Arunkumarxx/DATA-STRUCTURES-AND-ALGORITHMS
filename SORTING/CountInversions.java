package SORTING;

import java.util.ArrayList;

public class CountInversions {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 6};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i=0; i< arr.length; i++)
        {

            for (int j=i+1; j< arr.length; j++)
            {
                ArrayList<Integer> temp=new ArrayList<>();
                if(arr[i]>arr[j]) {
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    list.add(temp);
                }
            }

        }
        for (int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
