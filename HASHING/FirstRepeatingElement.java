package HASHING;

import java.util.ArrayList;
import java.util.List;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int [] arr ={1,5,3,4,3,5,6};
        int n= arr.length;
        List<List<Integer>> list =new ArrayList<>();
        for (int i=0; i<n; ++i)
            list.add(new ArrayList<>());
    }
}
