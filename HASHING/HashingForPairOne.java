package HASHING;

import java.util.Arrays;
import java.util.Random;

public class HashingForPairOne {
    private void PaidCheck(){

    }
    public static void main(String[] args) {
        int [] arr = new int [100];
        Random random = new Random();
        for (int i=0 ;i< arr.length; ++i)
            arr[i]=random.nextInt(1,10);

        System.out.println(Arrays.toString(arr));
        
    }
}
