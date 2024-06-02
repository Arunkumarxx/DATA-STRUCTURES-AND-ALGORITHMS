package ARRAYS;

import org.w3c.dom.ls.LSOutput;

public class RangeSumQueriesUsingPrefixSum {
    public static void main(String[] args) {
        int arr[] = {4, 5, 3, 2, 5};
        int sum = 0;
        int input = 13, start = input / 10, end = input % 10;
        while (start<=end){
            sum+=arr[start];
            if (start!=end)
                sum+=arr[end];
            start++;
            end--;
        }
        System.out.println(sum);

    }


}
