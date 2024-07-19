package HASHING;

import java.util.HashSet;

public class HashingForPairTwo {
    public static void main(String[] args) {
        int[] arr1 =
    {73, 23, 39, 93, 39, 80, 91, 58, 59, 92, 16, 89, 57, 12, 3, 35, 73, 56, 29};
        int target=47;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i< arr1.length; i++)
        {
            for (int j=0; j< arr1.length; j++)
            {
                if(arr1[i]+arr1[j]==target)
                    System.out.println(arr1[i]+","+arr1[j]);
            }
        }
    }
}
