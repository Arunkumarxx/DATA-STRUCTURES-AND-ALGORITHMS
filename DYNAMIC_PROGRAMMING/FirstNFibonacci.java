package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class FirstNFibonacci
{
    public  long[] printFibb(int n)
    {
        if(n==1)
            return new long[]{1};

        if(n==2)
            return new long []{1,1};

        long [] result =new long[n];

        // Note: The first two number of the series are 1 and 1.

        result[0]=1;
        result[1]=1;

        for(int k=2;k<n;++k)
            result[k]=result[k-2]+result[k-1];

        return result;
    }
    public static void main(String[] args)
    {
        FirstNFibonacci obj =new FirstNFibonacci();
        System.out.println(Arrays.toString(obj.printFibb(15)));
    }
}
