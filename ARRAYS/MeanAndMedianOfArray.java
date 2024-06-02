package ARRAYS;
import java.util.Arrays;
public class MeanAndMedianOfArray {
    public static int median(int A[],int N)
    {
        Arrays.sort(A);

        int median = 0;

        if(N % 2 == 0)

            median =( int ) Math.floor( (A[(N / 2) - 1] + A[N / 2]) / 2);

        else

            median = ( int ) Math.floor( A[N / 2] );

        return median ;
    }
    //Function to find median of the array elements.
    public static int mean(int A[],int N)
    {
        int start = 0,end = N-1,sum= 0;

        while(start <= end){

            sum +=A[start];

            if(start != end)
                sum += A[end];
             start++;
            end--;
        }

        return sum / N;

    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 4};

      int res1 =  mean(arr, arr.length);

       int res2 = median(arr, arr.length);

        System.out.println(res1+" "+res2);
    }
}