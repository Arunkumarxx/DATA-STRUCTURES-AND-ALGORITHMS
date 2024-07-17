package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int n = arr.length;
        int res=0;
        int count=1;
        for (int i = 0; i < arr.length; ++i)
            arr[i]=count;

        for (int i = 0; i < n; i++)
            res += arr[i];
        int sum=0;
        System.out.println(res);
        int left = 0; // 0
        int leftHalf = (n - 1) / 4; // 25
        int mid = (n - 1) / 2; // 50
        int right = n - 1; // 99
        int rightHalf = ((n - 1) / 2) + ((n - 1) / 4); // 75
        int breakLeft = (n - 1) / 4;
        int breakRight = ((n - 1) / 2) + ((n - 1) / 4);
        while (left < breakLeft && leftHalf < mid && rightHalf > mid && right > breakRight) {
            
            left++;
            leftHalf++;
            rightHalf--;
            right--;
        }
    }
}
