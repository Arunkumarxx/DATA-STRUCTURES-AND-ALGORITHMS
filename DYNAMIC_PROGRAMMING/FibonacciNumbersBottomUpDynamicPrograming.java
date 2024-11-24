package DYNAMIC_PROGRAMMING;

import javax.sound.sampled.EnumControl;
import java.util.*;
public class FibonacciNumbersBottomUpDynamicPrograming
{

    long [] arr;
    public long findNthFibonacci(int number)
    {
        arr=new long [number+1];
        Arrays.fill(arr,-1);
        return  recursion(number);
    }

    public long recursion(long n)
    {
        if(arr[(int)n]==-1L)
        {
            long res;
            if(n==0L || n==1L)
                return n;
            else
                res=recursion(n-1L)+recursion(n-2L);
            arr[(int)n]=res;
        }
        return arr[(int)n];
    }

    public static void main(String[] args)
    {
        FibonacciNumbersBottomUpDynamicPrograming obj =new FibonacciNumbersBottomUpDynamicPrograming();
        System.out.println(obj.findNthFibonacci(100));
    }
}
