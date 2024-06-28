package SEARCHING;
import java.util.Arrays;
public class TripletInASortedArray {
    public static void main(String[] args) {
        int [] arr = {1 ,2,4,3,6};
        Arrays.sort(arr);
        int n= arr.length;
        int sum=10;
        for (int i=0; i<n-2; i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if (arr[i]+arr[j]+arr[k]==sum) {
                    System.out.println(i + " " + j + " " + k);
                   break;
                }if(arr[i]+arr[j]+arr[k]<sum)
                j++;
            else k--;
            }
        }
    }
}