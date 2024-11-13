package GREEDY;

import java.util.Collections;

public class ActivitySelection
{
    private int getMaximumNumberOfActivity(int [] [] PairArray)
    {
        Collections.sort(PairArray,(a,b)->Integer.compare(a[0][1],b[0][1]));
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
