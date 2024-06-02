package SEARCHING;


import java.util.HashMap;

public class CountMoreThanNDivideByKOccurences {
    public static void main(String[] args) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int n = arr.length;
        int k = 4;
        for (int x:arr) {
            integerHashMap.put(x, integerHashMap.getOrDefault(x, 0) + 1);
        }
        int c = 0;
        for (int key : integerHashMap.keySet()) {
            if (integerHashMap.get(key) > n / k)
                c++;
        }
        System.out.println(c);
    }
}
