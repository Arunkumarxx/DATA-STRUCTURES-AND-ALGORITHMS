package ARRAYS;

import java.awt.event.ItemEvent;
import java.util.Arrays;

public class MaximumDifferenceProblemWithOrder {
    public static void main(String[] args) {
        int  max=0;
        int arr[] ={2,3,10,6,4,8,1};
        int n= arr.length;
        int result=arr[1]-arr[0],minValue=arr[0];
        for (int i = 0; i < n; i++){
            result=Integer.max(result,arr[i]-minValue );
            minValue=Integer.min(minValue,arr[i]);
        }
        System.out.println(result);
    }
}
