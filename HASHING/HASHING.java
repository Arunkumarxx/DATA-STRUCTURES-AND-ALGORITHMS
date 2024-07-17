package HASHING;

import java.util.Arrays;
import java.util.HashMap;

public class HASHING {
    public static void main(String[] args) {
        int [] arr = new int[100];
        int n= arr.length;
        for (int i=0; i< arr.length;++i)
            arr[i]+=i+1;

        int startOne= (n/100)*0;
        int endOne=   (n/100)*49;
        int startTwo =(n/100)*50;
        int endTwo =(n/100)*99;
        int sum=0;
        while(startOne<endOne && startTwo<endTwo)
            sum+=(arr[startOne]+arr[endOne]+arr[startTwo]+arr[endTwo]);
    }
}
