package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int n= arr.length;
        for (int i=0; i< arr.length;++i)
            arr[i]+=i+1;

        System.out.println((n/100)*0);
        System.out.println((n/100)*49);
        System.out.println((n/100)*50);
        System.out.println((n/100)*99);
    }
}
