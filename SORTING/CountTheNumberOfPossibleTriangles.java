package SORTING;

import java.util.Arrays;

public class CountTheNumberOfPossibleTriangles {
    public static void main(String[] args) {
        int [] arr ={3, 5, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n= arr.length;
        int a=0;
        int b=n-2;
        int c=n-1;
        int count=0;
        while(c>=2){
            while(a+b<c && a<b)
                ++a;
            count+=b-a;
            --b;
            while(a+b<c && a<b)
                ++a;
            count+=b-a;
            c--;
            b=c-1;
            a=0;
        }
        System.out.println(count);
    }
}