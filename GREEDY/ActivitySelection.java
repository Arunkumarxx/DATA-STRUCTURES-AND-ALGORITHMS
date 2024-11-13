package GREEDY;

import java.util.Arrays;
public class ActivitySelection
{
    private int getMaximumNumberOfActivity(int [] [] PairArray)
    {
        Arrays.sort(PairArray, (a, b) -> Integer.compare(a[1], b[1]));
        return -1;
    }
    public static void main(String[] args)
    {
        ActivitySelection obj =new ActivitySelection();
         int [][] PairArray ={
                 {3,8},
                 {2,4},
                 {1,4},
                 {10,11}
         };
    }
}
