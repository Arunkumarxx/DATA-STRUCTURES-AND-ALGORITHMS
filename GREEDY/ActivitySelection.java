package GREEDY;

import java.util.Collections;

public class ActivitySelection
{
    private int getMaximumNumberOfActivity(Pair [] pairArr)
    {
        Collections.sort(pairArr,(a,b)->Integer.compare(a[0].start,b[0]));
        return -1;
    }
    public static void main(String[] args)
    {
        ActivitySelection obj =new ActivitySelection();
         int [][] arr ={
                 {3,8},
                 {,4},
                 {}
         };
    }
}
